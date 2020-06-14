package example.src.mooc.shared.domain.student;

import example.src.mooc.shared.domain.exceptions.RequiredException;

public class StudentId {

    private final static String REQUIRED_STUDENT_ID_MESSAGE = "the id of the student is required";

    private final String id;

    public StudentId(final String id) {
        validateStudentID(id);
        this.id = id;
    }

    public String value() {
        return id;
    }

    private static void validateStudentID(final String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new RequiredException(REQUIRED_STUDENT_ID_MESSAGE);
        }
    }

}
