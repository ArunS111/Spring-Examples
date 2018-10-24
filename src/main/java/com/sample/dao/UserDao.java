package com.sample.dao;

import com.sample.model.Login;
import com.sample.model.User;

public interface UserDao {


	  void register(User user);
	  User validateUser(Login login);
	  
}
