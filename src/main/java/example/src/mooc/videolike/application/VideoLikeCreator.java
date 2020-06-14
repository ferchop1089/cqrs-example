package example.src.mooc.videolike.application;

import example.src.mooc.shared.domain.student.StudentId;
import example.src.mooc.shared.domain.video.VideoId;
import example.src.mooc.videolike.model.VideoLike;
import example.src.mooc.videolike.model.VideoLikeId;
import example.src.mooc.videolike.model.VideoLikeRepository;
import example.src.shared.domain.EventBus;

public final class VideoLikeCreator {

	private final VideoLikeRepository repository;
	private final EventBus bus;

	public VideoLikeCreator(final VideoLikeRepository repository, final EventBus bus) {
		this.repository = repository;
		this.bus = bus;
	}

	public void create(final String videoLikeId, final String videoId, final String studentId) {
		final VideoLike videoLike = VideoLike.createLike(new VideoLikeId(videoLikeId), new VideoId(videoId),
				new StudentId(studentId));

		repository.save(videoLike);

		bus.publish(videoLike.pullDomainEvents());
	}

}
