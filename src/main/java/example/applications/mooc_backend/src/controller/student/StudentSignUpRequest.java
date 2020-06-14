package example.applications.mooc_backend.src.controller.student;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class StudentSignUpRequest {

    @JsonProperty("student_id")
    private String studentID;

    @JsonProperty("student_name")
    private String studentName;

    @JsonProperty("student_password")
    private String studentPassword;

    public StudentSignUpRequest() {
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

}