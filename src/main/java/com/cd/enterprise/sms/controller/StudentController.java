package com.cd.enterprise.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cd.enterprise.sms.entity.Student;
import com.cd.enterprise.sms.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("/students")
	public ModelAndView listStudents(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("students");
		modelAndView.addObject("students", studentService.getAllStudents());
		return modelAndView;
	}

	@GetMapping("/students/new")
	public ModelAndView createStudentForm(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("create_student");
		Student student = new Student();
		modelAndView.addObject("student", student);
		return modelAndView;
	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}

	@GetMapping("/students/edit/{id}")
	public ModelAndView editStudentForm(@PathVariable Long id, Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("edit_student");
		modelAndView.addObject("student", studentService.getStudentById(id));
		return modelAndView;
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		studentService.saveStudent(existingStudent);
		
		return "redirect:/students";
	}
	
	
	// handler method
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}

}
