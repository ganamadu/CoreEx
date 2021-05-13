package com.spring.postConstruct;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostConstructMailServiceTest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.spring.postConstruct");
		context.refresh();
		
		MailService mailService1 = context.getBean(MailService.class);
		mailService1.send("abc@gmail.com");
		
		MailService mailService2 = context.getBean(MailService.class);
		mailService2.send("xyz@gmail.com");
		
		context.close();
	}

}
