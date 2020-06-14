package example.src.mooc.video.domain;

import example.src.mooc.shared.domain.video.VideoId;
import example.src.shared.domain.AggregateRoot;

public final class Video extends AggregateRoot {

	private final VideoId id;
	private final VideoTitle title;
	private final VideoDescription description;

	public Video(final VideoId id, final VideoTitle title, final VideoDescription description) {
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public VideoId id() {
		return id;
	}

	public VideoTitle title() {
		return title;
	}

	public VideoDescription description() {
		return description;
	}

	public final static Video create(final VideoId id, final VideoTitle title, final VideoDescription description) {
		final Video video = new Video(id, title, description);

		video.record(new VideoCreatedDomainEvent(id.value(), title.value(), description.value()));

		return video;
	}

}
