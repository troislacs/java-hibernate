package com.jac.springdemo1;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class V106_HelloSpringApp {
	public static void main(String[] args) {
		// 1. Load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. Retrieve bean from spring container
		ICoach theCoach = context.getBean("myCoach",ICoach.class);
		
		// 3. Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// 4. Close the context
		context.close();		
	}
}
