package kr.ac.ks.app;

import kr.ac.ks.app.domain.Student;
import kr.ac.ks.app.repository.LessonRepository;
import kr.ac.ks.app.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	private final StudentRepository studentRepository;
	private final LessonRepository lessonRepository;

	public AppApplication(StudentRepository studentRepository, LessonRepository lessonRepository) {
		this.studentRepository = studentRepository;
		this.lessonRepository = lessonRepository;
		for(int i = 1; i <= 5; i++){
			studentRepository.save(
					new Student("Student" + i , "st." + i + "@yahoo.com")
			);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
