package com.demo.dao;

import com.demo.beans.MyUser;

public interface MyUserDao {

	void saveUser(MyUser user);
	MyUser getUser(int id);

}
