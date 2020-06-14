package example.infrastructure.bus;

import java.util.Arrays;
import java.util.List;

import example.src.shared.domain.DomainEvent;
import example.src.shared.domain.EventBus;

public final class VideoInMemoryEventBus implements EventBus {

	@Override
	public void publish(List<DomainEvent> events) {
		System.out.println("list of events to publish: " + Arrays.toString(events.toArray()));
	}

}
