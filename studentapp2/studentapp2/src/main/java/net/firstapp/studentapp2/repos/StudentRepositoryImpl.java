package net.firstapp.studentapp2.repos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.firstapp.studentapp2.model.Student;
@Repository
public class StudentRepositoryImpl implements StudentRepository {

	List<Student> studList = new ArrayList<Student>();

	@Override
	public Student insertStudent(Student student) {
		if (studList.add(student))
			return student;

		return null;
	}

	@Override
	public List<Student> finaAllStudents() {
		return studList;
	}

	@Override
	public Student findStudentById(int id) {
		for (Student student : studList) {
			if (student.getId() == id)
				return student;
		}
		return null;
	}

	@Override
	public Student modifyStudent(int id, Student updatedstudent) {
		for (Student student : studList) {
			if (student.getId() == id) {
				student.setName(updatedstudent.getName());
				student.setAge(updatedstudent.getAge());
				student.setCourse(updatedstudent.getCourse());
				return student;
			}
		}
		return null;
	}

	@Override
	public void removeStudent(int id) {
		Student student = findStudentById(id);
		if (student != null)
			studList.remove(student);

	}

}
