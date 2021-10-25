package com.cd.enterprise.sms.service;

import java.util.List;

import com.cd.enterprise.sms.entity.Student;

public interface StudentService {	
	List<Student> getAllStudents();
	void saveStudent(Student student);
	Student updateStudent(Student student);
	Student getStudentById(Long id);
	void deleteStudentById(Long id);

}
