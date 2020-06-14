package example.src.shared.infrastructure;

import java.util.List;
import java.util.Set;

import example.src.shared.domain.DomainEvent;
import example.src.shared.domain.DomainEventSubscriber;
import reactor.bus.Event;
import reactor.bus.EventBus;
import reactor.bus.selector.Selectors;
import reactor.fn.Consumer;

public class ReactorSynchronousEventBus implements example.src.shared.domain.EventBus {

    private final EventBus bus;

    public ReactorSynchronousEventBus(final Set<DomainEventSubscriber<DomainEvent>> subscribers) {
        bus = EventBus.create();
        subscribers.forEach(this::registerEventBus);
    }

    @Override
    public void publish(final List<DomainEvent> events) {
        events.forEach(this::publish);
    }

    private void publish(final DomainEvent event) {
        final Class<? extends DomainEvent> eventIdentifier = event.getClass();
        final Event<DomainEvent> wrappedEvent = Event.wrap(event);

        bus.notify(eventIdentifier, wrappedEvent);
    }

    private void registerEventBus(final DomainEventSubscriber<DomainEvent> subscriber) {
        bus.on(Selectors.$(subscriber.subscribedTo()), eventConsumer(subscriber));
    }

    private Consumer<Event> eventConsumer(final DomainEventSubscriber<DomainEvent> subscriber) {
        return (reactorEvent) -> {
            final DomainEvent unwrappedEvent = (DomainEvent) reactorEvent.getData();
            subscriber.consume(unwrappedEvent);
        };
    }

}