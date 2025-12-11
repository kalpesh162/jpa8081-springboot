package net.first.studentapp1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.first.studentapp1.model.Student;

@RestController
public class StudentController {

	@GetMapping("/get")
	public Student getStudent() {
		Student student = new Student(11, "Kalpesh", 55);
		return student;
	}

	@GetMapping("/getall")
	public List<Student> getAllStudents() {
		ArrayList<Student> list = new ArrayList<Student>();
		Student student = new Student(11, "Ramesh", 66.66);
		Student student1 = new Student(12, "Suresh", 76.66);
		Student student2 = new Student(13, "Rajesh", 65.66);
		Student student3 = new Student(14, "Ganesh", 61.66);
		Student student4 = new Student(15, "Kalpesh", 16.66);
		list.add(student4);
		list.add(student3);
		list.add(student2);
		list.add(student1);
		list.add(student);
		return list;

	}

}
