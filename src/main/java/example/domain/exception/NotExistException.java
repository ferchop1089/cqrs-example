package example.domain.exception;

public final class NotExistException extends RuntimeException {

	private static final long serialVersionUID = -4532199263897259592L;

	public NotExistException(String message) {
		super(message);
	}
	
	public NotExistException(String message, Throwable ex) {
		super(message, ex);
	}

}
