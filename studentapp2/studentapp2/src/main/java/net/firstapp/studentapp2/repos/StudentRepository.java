package net.firstapp.studentapp2.repos;

import java.util.List;

import net.firstapp.studentapp2.model.Student;

public interface StudentRepository  {

	Student insertStudent(Student student);

	List<Student> finaAllStudents();

	Student findStudentById(int id);

	Student modifyStudent(int id, Student student);

	void removeStudent(int id);
	
}
