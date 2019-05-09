package com.example.demo.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestMain {

    public static void main(String[] args) {

        String password = "faxri";
        TestMain testMain = new TestMain();
        String encodedPassword = testMain.encodedPassword(password);
        System.out.println(encodedPassword);

    }

    public String encodedPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(password);
        return encodedPassword;
    }
}
