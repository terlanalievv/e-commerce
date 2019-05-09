package com.example.demo.service.implementation;


import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /*@Override
    public User insert(User user) {
        return userRepository.insert(user);
    }

    @Override
    public User authenticate(User user) {
        return userRepository.authenticate(user);
    }*/

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }
}
