package kr.ac.ks.app.controller;

import kr.ac.ks.app.domain.Lesson;
import kr.ac.ks.app.domain.Student;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CourseForm {

    @NotNull(message = "수강신청은 학생 중심으로 되어야 합니다!")
    private Student student;

    @NotNull(message = "수강신청은 수업을 듣기 위해 하는 것입니다!")
    private Lesson lesson;
}
