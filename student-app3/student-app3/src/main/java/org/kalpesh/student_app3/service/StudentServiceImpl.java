package org.kalpesh.student_app3.service;

import java.util.List;
import java.util.Optional;

import org.kalpesh.student_app3.model.Student;
import org.kalpesh.student_app3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		return getStudentRepository().save(student);

	}

	@Override
	public List<Student> getAllStudents() {
		return getStudentRepository().findAll();
	}

	@Override
	public Student getStudentById(int id) {
		Optional<Student> option = getStudentRepository().findById(id);
		if (option.isPresent())
			return option.get();
		return null;
	}

	@Override
	public Student updateStudent(int id, Student student) {
		if (getStudentById(id) != null)
			return getStudentRepository().save(student);
		return null;
	}

	@Override
	public void deleteStudent(int id) {
		getStudentRepository().deleteById(id);

	}

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

}
