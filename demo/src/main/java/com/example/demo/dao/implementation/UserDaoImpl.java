package com.example.demo.dao.implementation;
import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserRepositoryImpl userRepository;

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }

    @Override
    public Optional<User> getUserByToken(String token) {
        return userRepository.getUserByToken(token);
    }

    @Override
    public boolean updateUserStatus(long userId) {
        return userRepository.updateUserStatus(userId);
    }

    @Override
    public boolean checkUserEmail(String email) {
        return userRepository.checkUserEmail(email);
    }

    @Override
    public boolean updateUserPassword(String email, String password) {
        return userRepository.updateUserPassword(email, password);
    }

    @Override
    public boolean saveUser(User user) {
        return userRepository.insertUser(user);
    }

    @Override
    public int getUserSeqValue() {
        return userRepository.getUserSeqValue();
    }
}
