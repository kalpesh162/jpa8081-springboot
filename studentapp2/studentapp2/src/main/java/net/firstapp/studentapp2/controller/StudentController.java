package net.firstapp.studentapp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.firstapp.studentapp2.model.Student;
import net.firstapp.studentapp2.service.StudentService;

// @Controller
@RestController // @RestController = @Controller+ @ResponceBody
@RequestMapping("/students")
public class StudentController {

	private StudentService studentService;

	@PostMapping("/add")
	public Student addStudentRecord(@RequestBody Student student) {
		Student student2 = studentService.addStudent(student);
		if (student2 != null)
			return student;

		return null;
	}

	@GetMapping("/all")
	public List<Student> getAll() {
		return studentService.getAllStudents();
	}

	@GetMapping("/get/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}

	@PutMapping("/update/{id}")
	public Student updateCandidate(@PathVariable("id") int id, @RequestBody Student student) {
		studentService.updateStudent(id, student);
		return student;
	}

	@DeleteMapping("/delete/{id}")
	public void deleteCandidate(@PathVariable("id") int id) {
		studentService.deleteStudent(id);
	}

	public StudentService getStudentService() {
		return studentService;
	}

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

}
