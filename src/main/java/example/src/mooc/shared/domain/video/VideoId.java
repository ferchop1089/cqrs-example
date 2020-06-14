package example.src.mooc.shared.domain.video;

import example.src.shared.domain.RequiredException;

public final class VideoId {

	private final static String REQUIRED_VIDEO_ID_MESSAGE = "the id of the video is required";

	private final String id;

	public VideoId(final String id) {
		validateVideoId(id);
		this.id = id;
	}

	public String value() {
		return id;
	}

	private final static void validateVideoId(final String id) {
		if (id == null || id.isEmpty()) {
			throw new RequiredException(REQUIRED_VIDEO_ID_MESSAGE);
		}
	}

}
