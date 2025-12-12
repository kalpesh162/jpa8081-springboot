package org.kalpesh.student_app3.controller;

import java.util.List;

import org.kalpesh.student_app3.model.Student;
import org.kalpesh.student_app3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	private StudentService studentService;

	@PostMapping("/add")
	public Student saveRecord(@RequestBody Student student) {
		return getStudentService().addStudent(student);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable("id") Integer id) {
		getStudentService().deleteStudent(id);
	}

	@PutMapping("/update/{id}")
	public Student updateStuent(@PathVariable("id") Integer id, @RequestBody Student student) {
		return getStudentService().updateStudent(id, student);
	}

	@GetMapping("/get/{id}")
	public Student getStudentById(@PathVariable("id") Integer id) {
		return getStudentService().getStudentById(id);
	}

	@GetMapping("/getall")
	public List<Student> getAllStudents() {
		return getStudentService().getAllStudents();
	}

	public StudentService getStudentService() {
		return studentService;
	}

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
