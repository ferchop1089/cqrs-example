package example.src.mooc.student.domain;

import example.src.mooc.shared.domain.exceptions.RequiredException;

public class StudentName {

    private final static String REQUIRED_NAME_MESSAGE = "the name is invalid";

    private String name;

    public StudentName(String name) {
        validateStudentName(name);
        this.name = name;
    }

    public String value() {
        return name;
    }

    private static void validateStudentName(final String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new RequiredException(REQUIRED_NAME_MESSAGE);
        }
    }

}
