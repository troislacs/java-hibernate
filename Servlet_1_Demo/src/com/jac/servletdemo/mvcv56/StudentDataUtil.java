package com.jac.servletdemo.mvcv56;

import java.util.*;

public class StudentDataUtil {
	public static List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Marry","Public", "mary@jac.edu"));
		students.add(new Student("John","Doe", "john@jac.edu"));
		students.add(new Student("Ajay","Rao", "ajay@jac.edu"));
		
		return students;
	}
}
