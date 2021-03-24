package com.jac.springdemo.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/student")
public class Studentcontroller {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// 1. Create a student object
		Student theStudent = new Student();
		
		// 2. Add student object to the model
		theModel.addAttribute("student",theStudent);		
		return "student-form";	}
	
	// Create processing code
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent){
		// log the input data
		System.out.println("theStudent: " + theStudent.getFirstName()
				+ " " + theStudent.getLastName());		
		return "student-confirmation";	}
}
