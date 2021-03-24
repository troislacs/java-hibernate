package com.jac.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloSpringApp {
	public static void main(String[] args) {
		// 1. Load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. Retrieve bean from spring container
		ICoach theCoach = context.getBean("myCoach",ICoach.class);
		
		// 3. Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// 3+. Call the new methods for Fortunes
		System.out.println(theCoach.getDailyFortune());
		
		// 4. Close the context
		context.close();		
	}
}
