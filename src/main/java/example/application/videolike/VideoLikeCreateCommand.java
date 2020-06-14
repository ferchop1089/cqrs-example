package example.application.videolike;

import example.domain.bus.command.Command;

public final class VideoLikeCreateCommand implements Command {

	private String videoLikeId;
	private String videoId;
	private String userId;

	public VideoLikeCreateCommand(String videoLikeId, String videoId, String userId) {
		this.videoLikeId = videoLikeId;
		this.videoId = videoId;
		this.userId = userId;
	}

	public String getVideoLikeId() {
		return videoLikeId;
	}

	public String getVideoId() {
		return videoId;
	}

	public String getUserId() {
		return userId;
	}

}
