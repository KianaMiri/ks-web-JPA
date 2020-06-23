package kr.ac.ks.app.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@ToString
public class Lesson {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int quota;

    @OneToMany(mappedBy = "lesson")
    private List<Course> courses = new ArrayList<>();
}
