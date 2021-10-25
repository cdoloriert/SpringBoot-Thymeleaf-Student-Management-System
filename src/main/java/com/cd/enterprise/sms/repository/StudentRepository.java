package com.cd.enterprise.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cd.enterprise.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	

}
