package example.application.video;

import example.domain.bus.command.Command;

public final class VideoCreateCommand implements Command {

	private final String videoId;
	private final String title;
	private final String description;

	public VideoCreateCommand(String videoId, String title, String description) {
		this.videoId = videoId;
		this.title = title;
		this.description = description;
	}

	public String getVideoId() {
		return videoId;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

}
