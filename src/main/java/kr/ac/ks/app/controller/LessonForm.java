package kr.ac.ks.app.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Setter
@Getter
public class LessonForm {
    private Long id;

    @NotEmpty(message = "이름 없는 수업은 있을 수 없습니다")
    private String name;

    @Min(value = 1, message = "사람 수를 0 이하로 만드시다니. 너무하십니다!")
    private int quota;
}
