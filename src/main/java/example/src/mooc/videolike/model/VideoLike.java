package example.src.mooc.videolike.model;

import example.src.mooc.shared.domain.student.StudentId;
import example.src.mooc.shared.domain.video.VideoId;
import example.src.shared.domain.AggregateRoot;

public final class VideoLike extends AggregateRoot {

	private final VideoLikeId videoLikeId;
	private final VideoId videoId;
	private final StudentId studentId;

	public VideoLike(final VideoLikeId videoLikeId, final VideoId videoId, final StudentId studentId) {
		this.videoLikeId = videoLikeId;
		this.videoId = videoId;
		this.studentId = studentId;
	}

	public VideoLikeId videoLikeId() {
		return videoLikeId;
	}

	public VideoId videoId() {
		return videoId;
	}

	public StudentId studentId() {
		return studentId;
	}

	public final static VideoLike createLike(final VideoLikeId videoLikeId, final VideoId videoId,
			final StudentId studentId) {
		final VideoLike videoLike = new VideoLike(videoLikeId, videoId, studentId);

		videoLike.record(new VideoLikedDomainEvent(videoLikeId.value(), videoId.value(), studentId.value()));

		return videoLike;
	}

}
