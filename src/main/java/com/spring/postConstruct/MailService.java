package com.spring.postConstruct;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class MailService {
	
	private Map<String, String> map = null;
	
	public MailService() {
		map = new HashMap<>();
	}
	
	
	public void send(String mailTo) {
		//Code for sending mail
	    System.out.println("Inside send method - "+mailTo);
	}
	
	@PostConstruct
	public void init() {
		map.put("host", "example.gmail.com");
		map.put("port", "25");
		map.put("from", "example@gmail.com");
		System.out.println("Inside init method: "+map);
	}
	
	@PreDestroy
	public void destroy() {
		map.clear();
		System.out.println("Inside destory method: "+map);
	}	

}
