package com.project.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.project.hibernate.entity.Book;

public class BookDelete {
	
	public static void main(String[] args) {
		
		// Step A: Create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Book.class)
				.buildSessionFactory();		
		
		// Step B: Create session
		Session session = factory.getCurrentSession();		
		
		try {	
		// create studentId
			int bookId = 7;
		
		// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
		
		// retrieve student based on id: primary-key
			System.out.println("\nGetting Book with book_id: " + bookId);
			Book myBook = session.get(Book.class, bookId);
		
		// delete the student
			System.out.println("Deleting student: " + bookId);
			session.delete(myBook);			
		
			
		// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done!");			
			
		}finally {
			factory.close();
		}				
	}
}
