package example.src.mooc.student.domain;

import example.src.mooc.shared.domain.student.StudentId;

public final class Student {

    private final StudentId id;
    private final StudentName name;
    private final StudentPassword password;

    public Student(final StudentId id, final StudentName name, final StudentPassword password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public StudentId id() {
        return id;
    }

    public StudentName name() {
        return name;
    }

    public StudentPassword password() {
        return password;
    }

    public final static Student signUp(final StudentId id, final StudentName name, final StudentPassword password) {
        return new Student(id, name, password);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("[id:").append(this.id.value()).append(", name:").append(this.name.value())
                .append(", password: ***]").toString();
    }

}