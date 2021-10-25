package com.cd.enterprise.sms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

//	@Autowired
//	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {		
		
//		Student s1 = new Student("chris", "d", "cdoloriert@gmail.com");
//		studentRepository.save(s1);
//		
//		Student s2 = new Student("rob", "e", "robd@gmail.com");
//		studentRepository.save(s2);
//		
//		Student s3 = new Student("tom", "b", "tomb@gmail.com");
//		studentRepository.save(s3);
		
	}

}
