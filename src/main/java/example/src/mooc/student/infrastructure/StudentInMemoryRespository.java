package example.src.mooc.student.infrastructure;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import example.src.mooc.shared.domain.student.StudentId;
import example.src.mooc.student.domain.Student;
import example.src.mooc.student.domain.StudentRepository;

@Component
public class StudentInMemoryRespository implements StudentRepository {

    private final Map<String, Student> inMemory;

    public StudentInMemoryRespository() {
        this.inMemory = new HashMap<>();
    }

    @Override
    public void save(final Student student) {
        this.inMemory.put(student.id().value(), student);
    }

    @Override
    public boolean exist(final StudentId id) {
        return this.inMemory.get(id.value()) != null;
    }

}