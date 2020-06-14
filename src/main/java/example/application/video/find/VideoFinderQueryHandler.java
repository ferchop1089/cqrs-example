package example.application.video.find;

import example.application.video.VideoResult;
import example.domain.bus.query.Query;
import example.domain.bus.query.QueryHandler;
import example.domain.bus.query.Result;
import example.src.mooc.shared.domain.video.VideoId;
import example.src.mooc.video.domain.Video;

public final class VideoFinderQueryHandler implements QueryHandler {

	private final VideoFinder videoFinder;

	public VideoFinderQueryHandler(VideoFinder videoFinder) {
		this.videoFinder = videoFinder;
	}

	@Override
	public Result handler(Query query) {
		VideoFindQuery videoFind = (VideoFindQuery) query;
		VideoId videoId = new VideoId(videoFind.getVideoId());

		Video video = videoFinder.find(videoId);

		return mapper(video);
	}

	private final Result mapper(Video video) {
		return new VideoResult(video.id().value(), video.title().value(), video.description().value());
	}

}
