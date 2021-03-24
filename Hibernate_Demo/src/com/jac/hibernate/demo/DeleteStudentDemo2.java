package com.jac.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.jac.hibernate.demo.entity.Student;

public class DeleteStudentDemo2 {
	
	public static void main(String[] args) {
		
		// Step A: Create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();		
		
		// Step B: Create session
		Session session = factory.getCurrentSession();		
		
		try {		
		// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();	
			
		// Another way to delete (from query) (id=7)
			System.out.println("Deleting student id=7");
			session.createQuery("delete from Student where id=7").executeUpdate();
			
		// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done!");			
			
		}finally {
			factory.close();
		}				
	}
}
