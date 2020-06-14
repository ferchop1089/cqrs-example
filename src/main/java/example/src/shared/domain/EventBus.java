package example.src.shared.domain;

import java.util.List;

public interface EventBus {

	public void publish(List<DomainEvent> events);

}
