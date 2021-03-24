package com.jac.hibernate.demo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jac.hibernate.demo.entity.Student;
public class QueryStudentDemo3 {
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
			// Step.extra-2b: query students: lastname = 'Doe' or firstname = 'Daffy'
				theStudents = session.createQuery("from Student s where s.lastName='Doe' OR s.firstName='Daffy'").getResultList();
			// Step.extra-3b: display students
				System.out.println("\n\nStudents who have last name of Doe OR first name of Daffy");
				displayStudents(theStudents);				
			// Step.extra-2c: query students whose email ends with "@gmail.com"
				theStudents = session.createQuery("from Student s where s.email LIKE '%gmail.com'").getResultList();
			// Step.extra-3c: display students
				System.out.println("\n\nStudents whose email address ends with '@gmail.com'");
				displayStudents(theStudents);				
			// Step.extra-2d: query students whose email ends with "@jac.edu"
				theStudents = session.createQuery("from Student s where s.email LIKE '%jac.edu'").getResultList();
			// Step.extra-3d: display students
				System.out.println("\n\nStudents whose email address ends with '@jac.edu'");
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
