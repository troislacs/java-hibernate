package com.jac.hibernate.demo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jac.hibernate.demo.entity.Student;
public class QueryStudentDemo2 {
	public static void main(String[] args) {
		// Step A: Create session factory
			SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();		
		// Step B: Create session
			Session session = factory.getCurrentSession();		
		try {// Step 1. Start a transaction
				session.beginTransaction();						
			// Step 2. Qurery student
				List<Student> theStudents = session.createQuery("from Student").getResultList();			
			// Step 3. Display the students
				displayStudents(theStudents);			
			// Step.extra-2a: query students: lastname = 'Doe'
				theStudents = session.createQuery("from Student s where s.lastName='Doe'").getResultList();
			// Step.extra-3a: display students
				System.out.println("\n\nStudents who have last name of Doe");
				displayStudents(theStudents);			
			// Step 4. Commit transaction
				session.getTransaction().commit();}
		finally {factory.close();}				
	}
	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent:theStudents) {
			System.out.println(tempStudent);}
	}
}
