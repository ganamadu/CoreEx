package com.core.service;

import java.util.StringTokenizer;
import java.util.concurrent.Callable;

import com.core.core.UserDAO;
import com.core.entity.User;

public class UserService implements Callable<Integer> {
	
	private String userRecord;
	private UserDAO userDAO;
	
	public UserService(String userRecord, UserDAO userDAO) {
		this.userRecord = userRecord;
		this.userDAO = userDAO;
	}

	
	@Override
	public Integer call() throws Exception {
		int rows = 0;
		System.out.println(Thread.currentThread().getName()+" Processing record for "+userRecord);
		StringTokenizer tokenizer = new StringTokenizer(userRecord, ",");
		User user = null;
		while(tokenizer.hasMoreTokens()) {
			user = new User();
			user.setUserName(tokenizer.nextToken());
			user.setEmail(tokenizer.nextToken());
			user.setAge(Integer.valueOf(tokenizer.nextToken()));
			rows = userDAO.saveUser(user);
		}
		return rows;
	}
	
	
	

}
