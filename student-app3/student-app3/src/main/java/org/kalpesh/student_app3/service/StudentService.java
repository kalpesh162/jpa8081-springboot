package org.kalpesh.student_app3.service;

import java.util.List;

import org.kalpesh.student_app3.model.Student;

public interface StudentService {

	Student addStudent(Student student);

	List<Student> getAllStudents();

	Student getStudentById(int id);

	Student updateStudent(int id, Student student);

	void deleteStudent(int id);

}
