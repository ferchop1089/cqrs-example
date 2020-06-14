package example.applications.mooc_backend.src.controller.video;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class VideoFindResponse {

	@JsonProperty("video_id")
	private String videoId;

	@JsonProperty("title")
	private String title;

	@JsonProperty("description")
	private String description;

	public VideoFindResponse() {
	}

	public void setVideoId(final String videoId) {
		this.videoId = videoId;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

}
