package example.applications.mooc_backend.src.controller.video;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class VideoCreateRequest {

	@JsonProperty("video_id")
	private String videoId;

	@JsonProperty("title")
	private String title;

	@JsonProperty("description")
	private String description;

	public VideoCreateRequest() {
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
