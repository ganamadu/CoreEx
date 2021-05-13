package com.core.service;

import java.util.concurrent.Callable;

import com.core.core.UserDAO;
import com.core.entity.User;

public class GetUserProcess implements Callable<User> {
	
	private Integer userId;
	private UserDAO userDAO;
	
	public GetUserProcess(Integer userId, UserDAO userDAO) {
		this.userId = userId;
		this.userDAO = userDAO;
	}

	@Override
	public User call() throws Exception {
		//System.out.println(Thread.currentThread().getName()+" Processing record for "+userId);
		return userDAO.getUser(userId);
	}

}
