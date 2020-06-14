package example.src.mooc.shared.domain.exceptions;

public final class RequiredException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public RequiredException(final String message) {
        super(message);
    }

}