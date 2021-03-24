package com.jac.hibernate.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.jac.hibernate.demo.entity.Student;
public class ReadStudentDemo {
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
			Student tempStudent = new Student("Diego", "maradona", "diego@jac.edu");			
			// Step 2. Start a transaction
			session.beginTransaction();						
			// Step 3. Save the student object
			System.out.println("Saving the Student ...");
			session.save(tempStudent);			
			// Step 4. Commit transaction
			session.getTransaction().commit();			
			/* New code for retrieve */
			// Find out the student's id: primary key
			System.out.println("Save student. Generated id: " + tempStudent.getId());			
			// now get a new session, and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();			
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id:" + tempStudent.getId());
			Student myStudent = session.get(Student.class, tempStudent.getId());			
			System.out.println("Get complete: " + myStudent);			
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done!");			
			
		}finally {
			factory.close();
		}				
	}
}
