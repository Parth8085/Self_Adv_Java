package com.demo.service;

import com.demo.beans.User;
import com.demo.dao.*;

public class UserServiceImpl implements UserService {

	@Override
	public User authenticate(String email, String password) {
		UserDao dao=new UserDaoImpl();
		return dao.login(email,password);
	}

}
