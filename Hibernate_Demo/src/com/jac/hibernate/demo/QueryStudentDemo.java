package com.jac.hibernate.demo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.jac.hibernate.demo.entity.Student;
public class QueryStudentDemo {
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
				for(Student tempStudent:theStudents) {
				System.out.println(tempStudent);}			
			// Step 4. Commit transaction
				session.getTransaction().commit();			
		}finally {factory.close();}				
	}
}
