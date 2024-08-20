package com.mini.projects.di;

import com.mini.projects.di.dao.StudentDao;
import com.mini.projects.di.dao.IStudentDao;
import com.mini.projects.di.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(IStudentDao studentDAO) {

		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(IStudentDao studentDAO) {

		// create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("geo", "emad", "geo@geo.com");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());

		List<Student> students = studentDAO.findAll();
		for (Student student: students){
			System.out.println(student);
		}
	}

}

