package com.example.demo.dao;

import com.example.demo.domain.Elan;
import com.example.demo.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    Optional<User> getUserByEmail(String email);
    boolean saveUser(User user);
    int getUserSeqValue();
    Optional<User> getUserByToken(String token);
    boolean updateUserStatus(long userId);
    boolean checkUserEmail(String email);
    boolean updateUserPassword(String email, String password);
    public List<User> getAllUsers();
    public List<User> allUsers();
}
