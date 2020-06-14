package example.src.mooc.student.domain;

import example.src.mooc.shared.domain.exceptions.RequiredException;

public final class StudentPassword {

    private final static String REQUIRED_PASSWORD_MESSAGE = "the password of the student is required";

    private final String password;

    public StudentPassword(final String password) {
        validateStudentPassword(password);
        this.password = password;
    }

    public String value() {
        return this.password;
    }

    private static void validateStudentPassword(final String password) {
        if (password == null) {
            throw new RequiredException(REQUIRED_PASSWORD_MESSAGE);
        }
    }

}