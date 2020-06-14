package example.src.mooc.video.domain;

import example.src.shared.domain.DomainEvent;

public final class VideoCreatedDomainEvent implements DomainEvent {

	private static final String FULL_QUALIFIED_EVENT_NAME = "example.mooc.video.event.1.video.created";

	private final String id;
	private final String title;
	private final String description;

	public VideoCreatedDomainEvent(final String id, final String title, final String description) {
		this.id = id;
		this.title = title;
		this.description = description;
	}

	@Override
	public String fullQualifiedEventName() {
		return FULL_QUALIFIED_EVENT_NAME;
	}

	public String id() {
		return id;
	}

	public String title() {
		return title;
	}

	public String description() {
		return description;
	}

}
