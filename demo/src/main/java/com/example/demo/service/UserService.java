package com.example.demo.service;


import com.example.demo.domain.User;

import java.util.Optional;

public interface UserService {
    /*User insert(User user);
    User authenticate(User user);*/

    Optional<User> getUserByEmail(String email);
//    public String generateToken();
//    public Optional<User> getUserByToken(String resetToken);
//    public Optional<User> getUserByToken(String token);

}
