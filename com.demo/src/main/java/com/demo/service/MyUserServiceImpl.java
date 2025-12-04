package com.demo.service;

import com.demo.dao.MyUserDao;
import com.demo.dao.MyUserDaoImpl;
import com.demo.beans.MyUser;

public class MyUserServiceImpl implements MyUserService {

    private MyUserDao udao = new MyUserDaoImpl();

    @Override
    public void addUser(MyUser user) {
        udao.saveUser(user);
        System.out.println("User saved through SERVICE");
    }

    @Override
    public MyUser findUser(int id) {
        return udao.getUser(id);   // FIXED
    }
}
