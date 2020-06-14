package example.src.mooc.student.domain;

public final class AlreadyExistException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AlreadyExistException(final String message) {
        super(message);
    }

}
