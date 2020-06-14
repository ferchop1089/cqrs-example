package example.application.video.find;

import example.domain.exception.NotExistException;
import example.src.mooc.shared.domain.video.VideoId;
import example.src.mooc.video.domain.Video;
import example.src.mooc.video.domain.VideoRepository;

public final class VideoFinder {

	private static final String VIDEO_NOT_EXIST_MESSAGE = "the video with the id '%s' not exist";

	private final VideoRepository repository;

	public VideoFinder(VideoRepository repository) {
		this.repository = repository;
	}

	public final Video find(VideoId videoId) {
		Video video = repository.search(videoId);
		validate(videoId, video);

		return video;
	}

	private final void validate(VideoId videoId, Video video) {
		if (video == null) {
			throw new NotExistException(String.format(VIDEO_NOT_EXIST_MESSAGE, videoId.value()));
		}
	}

}
