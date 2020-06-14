package example.applications.mooc_backend.src.controller.student;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import example.src.mooc.shared.domain.student.StudentId;
import example.src.mooc.student.application.StudentSignUpper;
import example.src.mooc.student.domain.StudentName;
import example.src.mooc.student.domain.StudentPassword;

@RestController
@RequestMapping("/students")
public class StudentSignUpPostController {

    private final StudentSignUpper studentPutController;

    public StudentSignUpPostController(final StudentSignUpper studentPutController) {
        this.studentPutController = studentPutController;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void create(@RequestBody final StudentSignUpRequest studentRequest) {
        this.studentPutController.Create(new StudentId(studentRequest.getStudentID()),
                new StudentName(studentRequest.getStudentName()),
                new StudentPassword(studentRequest.getStudentPassword()));
    }

}