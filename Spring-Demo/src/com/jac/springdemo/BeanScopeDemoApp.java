package com.jac.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		// 1. Load Spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScopes-applicationContext.xml");
		
		// 2. Retrieve bean from Spring container
		ICoach theCoach = context.getBean("myCoach",ICoach.class);
		
		ICoach alphaCoach = context.getBean("myCoach",ICoach.class);
		
		// 3. Check if the above 2 beans are the same
		boolean result = (theCoach == alphaCoach);
		
		// 4. print the results
		System.out.println("\nPointing to the same object: " + result);		
		System.out.println("\nMemory location for theCoach " + theCoach);		
		System.out.println("\nMemory location for alphaCoach " + alphaCoach);		
			
		// 5. close the context
		context.close();
	}
}
