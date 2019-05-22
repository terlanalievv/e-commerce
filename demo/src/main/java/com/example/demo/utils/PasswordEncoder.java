package com.example.demo.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

    public static String encodedPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(password);
        return encodedPassword;
    }
}
