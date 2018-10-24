package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sample.dao.UserDaoImpl;
import com.sample.model.Login;
import com.sample.model.User;

public class UserService {
	
	@Autowired
	private UserDaoImpl userDao;
	
	
	
	public void register(User user) {
		userDao.register(user);
	}
	
	public User validateUser(Login login) {
		
		User user = userDao.validateUser(login);
		
		return user;
	}
	
	

}
