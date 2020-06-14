package example.src.mooc.student.application;

import example.src.mooc.student.domain.Student;
import example.src.mooc.student.domain.StudentName;
import example.src.mooc.student.domain.StudentPassword;
import example.src.mooc.student.domain.StudentRepository;
import example.src.mooc.shared.domain.student.StudentId;
import example.src.mooc.student.domain.AlreadyExistException;

public final class StudentSignUpper {

    private final StudentRepository repository;

    public StudentSignUpper(StudentRepository repository) {
        this.repository = repository;
    }

    public void Create(final StudentId id, final StudentName name, final StudentPassword password) {
        if (repository.exist(id)) {
            throw new AlreadyExistException(String.format("the student '%s' already exists", id.value()));
        }

        final Student student = Student.signUp(id, name, password);
        repository.save(student);
        System.out.println("student sign up: " + student);
    }

}