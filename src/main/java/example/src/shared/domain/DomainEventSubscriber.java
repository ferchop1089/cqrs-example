package example.src.shared.domain;

public interface DomainEventSubscriber<EventType extends DomainEvent> {

	public Class<EventType> subscribedTo();

	public void consume(EventType event);

}
