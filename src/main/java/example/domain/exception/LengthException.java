package example.domain.exception;

public final class LengthException extends RuntimeException {

	private static final long serialVersionUID = -9079897810084142842L;

	public LengthException(String message) {
		super(message);
	}

	public LengthException(String message, Throwable ex) {
		super(message, ex);
	}

}
