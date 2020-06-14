package example.src.mooc.video.domain;

public final class EmptyException extends RuntimeException {

	private static final long serialVersionUID = 6033935313593407065L;

	public EmptyException(final String message) {
		super(message);
	}

	public EmptyException(final String message, final Throwable ex) {
		super(message, ex);
	}

}
