package com.cd.enterprise.sms.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cd.enterprise.sms.entity.Student;
import com.cd.enterprise.sms.repository.StudentRepository;
import com.cd.enterprise.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public void saveStudent(Student student) {
		studentRepository.save(student);		
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);		
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();		
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}	
	
	
}
