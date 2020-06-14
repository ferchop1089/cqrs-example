package example.src.mooc.video.domain;

import example.src.mooc.shared.domain.exceptions.RequiredException;

public final class VideoTitle {

    private static final String REQUIRED_TITLE_MESSAGE = "the title is required";
    private static final String EMPTY_TITLE_MESSAGE = "the title is empty";

    private final String title;

    public VideoTitle(final String title) {
        validateTitle(title);
        this.title = title;
    }

    public String value() {
        return title;
    }

    private void validateTitle(final String title) {
        if (title == null) {
            throw new RequiredException(REQUIRED_TITLE_MESSAGE);
        }
        if (title.isEmpty()) {
            throw new EmptyException(EMPTY_TITLE_MESSAGE);
        }
    }

}