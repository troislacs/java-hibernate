package com.project.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.project.hibernate.entity.Book;
public class BookRead {
	public static void main(String[] args) {
		// Step A: Create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Book.class)
				.buildSessionFactory();		
		// Step B: Create session
		Session session = factory.getCurrentSession();		
		try {		
			
			session = factory.getCurrentSession();
			session.beginTransaction();			
			// retrieve Book based on the id: primary key
			
			System.out.println("\nGetting Book with book_id: 1");
			
			Book myBook = session.get(Book.class, 1);			
			System.out.println("Get complete: " + myBook);			
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done!");			
			
		}finally {
			factory.close();
		}				
	}
}
