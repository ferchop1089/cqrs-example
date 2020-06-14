package example.src.mooc.student.domain;

import example.src.mooc.shared.domain.student.StudentId;

public interface StudentRepository {

    public void save(Student student);

    public boolean exist(StudentId studentID);

}