package com.example.demo.service.implementation;

import com.example.demo.dao.PasswordResetDao;
import com.example.demo.domain.PasswordReset;
import com.example.demo.service.PasswordResetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class PasswordResetServiceImpl implements PasswordResetService {

    @Autowired
    private PasswordResetDao passwordResetDao;

    @Override
    public boolean insertPasswordReset(PasswordReset passwordReset) {
        return passwordResetDao.insertPasswordReset(passwordReset);
    }

    @Override
    public Optional<PasswordReset> getPasswordResetByToken(String token) {
        return passwordResetDao.getPasswordResetByToken(token);
    }

    @Override
    public boolean updateUserStatus(String token) {
        return passwordResetDao.updateUserStatus(token);
    }
}
