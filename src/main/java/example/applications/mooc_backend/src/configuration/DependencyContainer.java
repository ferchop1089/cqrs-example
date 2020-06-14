package example.applications.mooc_backend.src.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import example.src.mooc.student.application.StudentSignUpper;
import example.src.mooc.student.domain.StudentRepository;

@Configuration(value = "MoocDependencyContainer")
public class DependencyContainer {

    @Bean
    public StudentSignUpper injectStudentSignUpper(StudentRepository repository) {
        return new StudentSignUpper(repository);
    }

}