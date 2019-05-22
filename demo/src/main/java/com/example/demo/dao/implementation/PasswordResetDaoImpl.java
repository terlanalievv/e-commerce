package com.example.demo.dao.implementation;

import com.example.demo.dao.PasswordResetDao;
import com.example.demo.domain.PasswordReset;
import com.example.demo.repository.PasswordResetRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PasswordResetDaoImpl implements PasswordResetDao {

    @Autowired
    private PasswordResetRepositoryImpl passwordResetRepository;

    @Override
    public boolean insertPasswordReset(PasswordReset passwordReset) {
        return passwordResetRepository.insertPasswordReset(passwordReset);
    }

    @Override
    public Optional<PasswordReset> getPasswordResetByToken(String token) {
        return passwordResetRepository.getPasswordResetByToken(token);
    }

    @Override
    public boolean updateUserStatus(String token) {
        return passwordResetRepository.updateUserStatus(token);
    }
}
