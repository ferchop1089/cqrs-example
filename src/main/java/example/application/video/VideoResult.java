package example.application.video;

import example.domain.bus.query.Result;

public final class VideoResult implements Result {

	private final String videoId;
	private final String title;
	private final String description;

	public VideoResult(String videoId, String title, String description) {
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
