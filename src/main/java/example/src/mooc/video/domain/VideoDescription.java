package example.src.mooc.video.domain;

import example.domain.exception.LengthException;

public final class VideoDescription {

	private static final String DESCRIPTION_LENGTH_EXCEEDED_MESSAGE = "description length was exceeded by %d characters. Number of characters allowed: %d";
	private static final int LENGTH_DESCRIPTION_MAX = 25;

	private final String description;

	public VideoDescription(final String description) {
		validateDescription(description);
		this.description = description;
	}

	public String value() {
		return description;
	}

	private void validateDescription(final String description) {
		if (description == null || description.isEmpty()) {
			return;
		}

		if (description.length() > LENGTH_DESCRIPTION_MAX) {
			throw new LengthException(String.format(DESCRIPTION_LENGTH_EXCEEDED_MESSAGE,
					description.length() - LENGTH_DESCRIPTION_MAX, LENGTH_DESCRIPTION_MAX));
		}
	}

}
