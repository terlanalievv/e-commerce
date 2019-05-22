package com.example.demo.service.implementation;


import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.repository.SqlQuery;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.MessageDigest;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
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

    @Override
    public boolean saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public int getUserSeqValue() {
        return userDao.getUserSeqValue();
    }

    @Override
    public Optional<User> getUserByToken(String token) {
        return userDao.getUserByToken(token);
    }

    @Override
    public boolean updateUserStatus(long userId) {
        return userDao.updateUserStatus(userId);
    }

    @Override
    public boolean checkUserEmail(String email) {
        return userDao.checkUserEmail(email);
    }

    @Override
    public boolean updateUserPassword(String email, String password) {
        return userDao.updateUserPassword(email, password);
    }

//    @Override
//    public String generateToken() {
//            UUID uuid = UUID.randomUUID();
//            MessageDigest salt = null;
//            String digest = null;
//            try {
//                salt = MessageDigest.getInstance("SHA-256");
//                salt.update(uuid.toString().getBytes("UTF-8"));
//                digest = bytesToHex(salt.digest());
//            } catch (Exception e) {
//                e.printStackTrace();
//                throw new RuntimeException("Error generating token ", e);
//            }
//            return digest;
//        }
//
//    @Override
//    public Optional<User> getUserByToken(String token) {
//        List<User> userList = jdbcTemplate.query(SqlQuery.GET_USER_BY_TOKEN, new Object[] {token}, new UserRowMapper());
//        return getUser(userList);
//    }
//
//    @Override
//    public Optional<User> getUserByToken(String resetToken) {
//        return userDao.getUserByToken(resetToken);
//    }

}

