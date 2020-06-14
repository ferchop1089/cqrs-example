package example.application.video;

import example.domain.bus.command.Command;
import example.domain.bus.command.CommandHandler;
import example.src.mooc.shared.domain.video.VideoId;
import example.src.mooc.video.application.VideoCreator;
import example.src.mooc.video.domain.VideoDescription;
import example.src.mooc.video.domain.VideoTitle;

public final class VideoCreatorCommandHandler implements CommandHandler {

	private VideoCreator videoCreator;

	public VideoCreatorCommandHandler(VideoCreator videoCreator) {
		this.videoCreator = videoCreator;
	}

	@Override
	public void handler(Command command) {
		VideoCreateCommand video = (VideoCreateCommand) command;

		VideoId videoId = new VideoId(video.getVideoId());
		VideoTitle title = new VideoTitle(video.getTitle());
		VideoDescription description = new VideoDescription(video.getDescription());

		videoCreator.create(videoId, title, description);
	}

}
