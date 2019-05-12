package com.example.demo.dao;

import com.example.demo.domain.User;

import java.util.Optional;

public interface UserDao {

    Optional<User> getUserByEmail(String email);

    Optional<User> getUserByToken(String resetToken);
}
