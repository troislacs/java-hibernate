package com.jac.hibernate.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.jac.hibernate.demo.entity.Student;
public class ReadStudentDemo2 {
	public static void main(String[] args) {
		// Step A: Create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();		
		// Step B: Create session
		Session session = factory.getCurrentSession();		
		try {		
			
			session = factory.getCurrentSession();
			session.beginTransaction();			
			// retrieve student based on the id: primary key
			
			System.out.println("\nGetting student with id: 2");
			
			Student myStudent = session.get(Student.class, 2);			
			System.out.println("Get complete: " + myStudent);			
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done!");			
			
		}finally {
			factory.close();
		}				
	}
}
