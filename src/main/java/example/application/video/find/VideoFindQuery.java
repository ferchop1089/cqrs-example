package example.application.video.find;

import example.domain.bus.query.Query;

public final class VideoFindQuery implements Query {

	private final String videoId;

	public VideoFindQuery(String videoId) {
		this.videoId = videoId;
	}
	
	public String getVideoId() {
		return videoId;
	}

}
