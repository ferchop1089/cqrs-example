package example.src.shared.domain;

import java.util.LinkedList;
import java.util.List;

public abstract class AggregateRoot {

    private final List<DomainEvent> recordedDomainEvents = new LinkedList<>();

    public List<DomainEvent> pullDomainEvents() {
        final List<DomainEvent> events = new LinkedList<>(this.recordedDomainEvents);
        this.recordedDomainEvents.clear();
        return events;
    }

    protected void record(final DomainEvent event) {
        recordedDomainEvents.add(event);
    }

}