package com.jac.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jac.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		// Step A: Create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// Step B: Create session
		Session session = factory.getCurrentSession();
		
		try {
			// Step 1. Create a student object
			System.out.println("Creating new student object");
			Student tempStudent = new Student("Steven", "Smith", "john@jac.edu");
			
			// Step 2. Start a transaction
			session.beginTransaction();
						
			// Step 3. Save the student object
			System.out.println("Saving the Student ...");
			session.save(tempStudent);
			
			// Step 4. Commit transaction
			session.getTransaction().commit();
			
		}finally {
			factory.close();
		}				
	}
}
