package example.src.mooc.videolike.model;

import example.src.shared.domain.DomainEvent;

public final class VideoLikedDomainEvent implements DomainEvent {

	private static final String FULL_QUALIFIED_EVENT_NAME = "example.mooc.videolike.event.1.videolike.created";

	private final String videoLikeId;
	private final String videoId;
	private final String studentId;

	public VideoLikedDomainEvent(final String videoLikeId, final String videoId, final String studentId) {
		this.videoLikeId = videoLikeId;
		this.videoId = videoId;
		this.studentId = studentId;
	}

	@Override
	public String fullQualifiedEventName() {
		return FULL_QUALIFIED_EVENT_NAME;
	}

	public String videoLikeId() {
		return videoLikeId;
	}

	public String videoId() {
		return videoId;
	}

	public String studentId() {
		return studentId;
	}

}
