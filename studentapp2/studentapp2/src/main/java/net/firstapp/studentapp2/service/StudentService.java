package net.firstapp.studentapp2.service;

import java.util.List;

import net.firstapp.studentapp2.model.Student;

public interface StudentService {

	Student addStudent(Student student);

	List<Student> getAllStudents();

	Student getStudentById(int id);

	Student updateStudent(int id, Student student);

	void deleteStudent(int id);

}
