package com.project.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.hibernate.entity.Book;

public class BookAdd {

	public static void main(String[] args) {
		// Step A: Create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Book.class)
				.buildSessionFactory();
		
		// Step B: Create session
		Session session = factory.getCurrentSession();
		
		try {
			// Step 1. Create a student object
			System.out.println("Creating new book object");
			Book tempBook = new Book("Spring In Action", "Craig Walls", "Manning Publications", "2019-12-12");
			
			// Step 2. Start a transaction
			session.beginTransaction();
						
			// Step 3. Save the student object
			System.out.println("Saving the new Book ...");
			session.save(tempBook);
			
			// Step 4. Commit transaction
			session.getTransaction().commit();
			
		}finally {
			factory.close();
		}				
	}
}
