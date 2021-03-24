package com.project.hibernate;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.hibernate.entity.Book;
public class BookQuery {
	public static void main(String[] args) {
		// Step A: Create session factory
			SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Book.class)
				.buildSessionFactory();		
		// Step B: Create session
			Session session = factory.getCurrentSession();		
		try {// Step 1. Start a transaction
				session.beginTransaction();						
			// Step 2. Query ALL Books
				List<Book> theBooks = session.createQuery("from Book").getResultList();			
			// Step 3. Display ALL Books
				System.out.println("\n\nAll books in the library");
				displayBooks(theBooks);							

			// Step.2X: query Books that contain 'Java'
				theBooks = session.createQuery("from Book b where b.book_title LIKE '%Java%'").getResultList();
			// Step.3X: display Books that the title has 'Java'
				System.out.println("\n\nBooks whose titles contain 'Java'");
				displayBooks(theBooks);	
				
			// Step 4. Commit transaction
				session.getTransaction().commit();}
		finally {factory.close();}		
	}
	private static void displayBooks(List<Book> theBooks) {
		for(Book tempBook:theBooks) {
			System.out.println(tempBook);}
	}
}
