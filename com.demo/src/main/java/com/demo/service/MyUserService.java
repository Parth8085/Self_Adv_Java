package com.demo.service;

import com.demo.beans.MyUser;

public interface MyUserService {

	void addUser(MyUser user);
	MyUser findUser(int id);

}
