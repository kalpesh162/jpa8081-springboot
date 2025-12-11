package net.firstapp.studentapp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.firstapp.studentapp2.model.Student;
import net.firstapp.studentapp2.repos.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		return getStudentRepository().insertStudent(student);
	}

	@Override
	public List<Student> getAllStudents() {

		return getStudentRepository().finaAllStudents();
	}

	@Override
	public Student getStudentById(int id) {

		return getStudentRepository().findStudentById(id);
	}

	@Override
	public Student updateStudent(int id, Student student) {

		return getStudentRepository().modifyStudent(id, student);
	}

	@Override
	public void deleteStudent(int id) {
		getStudentRepository().removeStudent(id);

	}

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

}
