package com.project.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.project.hibernate.entity.Book;

public class BookUpdate {
	
	public static void main(String[] args) {
		
		// Step A: Create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Book.class)
				.buildSessionFactory();		
		
		// Step B: Create session
		Session session = factory.getCurrentSession();		
		
		try {	
			int bookId = 1;
			
			// now get a new session, and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve book based on the id: primary key
			System.out.println("\nGetting Book with id:" + bookId);
			Book myBook= session.get(Book.class, bookId);			
			System.out.println("Updating book ...");
			myBook.setBookTitle("Visual C# How To Program - Edition 2");
			myBook.setPublishDate("2012-02-22");
			
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Update Successfully");				
			
		}finally {
			factory.close();
		}				
	}
}
