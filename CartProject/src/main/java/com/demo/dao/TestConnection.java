package com.demo.dao;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection con = DBConnection.getConnection();
        if(con != null){
            System.out.println("CONNECTION WORKING ✅");
        } else {
            System.out.println("CONNECTION FAILED ❌");
        }
    }
}

