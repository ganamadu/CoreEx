package com.spring.primary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryUserServiceTest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		
		User user = context.getBean(User.class);
		user.doSomething();
		
		context.close();
		
	}

}
