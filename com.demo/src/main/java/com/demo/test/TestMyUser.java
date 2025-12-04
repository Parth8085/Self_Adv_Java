package com.demo.test;

import com.demo.beans.MyUser;
import com.demo.service.MyUserService;
import com.demo.service.MyUserServiceImpl;

public class TestMyUser {
    public static void main(String[] args) {

        MyUserService service = new MyUserServiceImpl();

        MyUser user = new MyUser(1, "Parth", "parth@example.com");

        service.addUser(user);

        MyUser fetched = service.findUser(1);

        if (fetched != null)
            System.out.println("Fetched User: " + fetched.getName());
        else
            System.out.println("User not found!");
    }
}
