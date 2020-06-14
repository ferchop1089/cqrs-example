package example.application.videolike;

import example.domain.bus.command.Command;
import example.domain.bus.command.CommandHandler;
import example.src.mooc.shared.domain.video.VideoId;
import example.src.mooc.videolike.application.VideoLikeCreator;

public final class VideoLikeCreatorCommandHandler implements CommandHandler {

	private VideoLikeCreator videoLikeCreator;

	public VideoLikeCreatorCommandHandler(VideoLikeCreator videoLikeCreator) {
		this.videoLikeCreator = videoLikeCreator;
	}

	@Override
	public void handler(Command command) {
		VideoLikeCreateCommand videoLike = (VideoLikeCreateCommand) command;

		VideoId videoId = new VideoId(videoLike.getVideoId());

		videoLikeCreator.create(videoLike.getVideoLikeId(), videoId.value(), videoLike.getUserId());
	}

}
