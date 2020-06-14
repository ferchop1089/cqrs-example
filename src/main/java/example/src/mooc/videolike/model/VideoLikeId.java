package example.src.mooc.videolike.model;

import example.src.mooc.shared.domain.exceptions.RequiredException;

public final class VideoLikeId {

    private final static String REQUIRED_VIDEO_LIKE_ID_MESSAGE = "the id of the like is required";

    private final String id;

    public VideoLikeId(final String id) {
        validateVideoId(id);
        this.id = id;
    }

    public String value() {
        return id;
    }

    private final static void validateVideoId(final String id) {
        if (id == null || id.isEmpty()) {
            throw new RequiredException(REQUIRED_VIDEO_LIKE_ID_MESSAGE);
        }
    }

}