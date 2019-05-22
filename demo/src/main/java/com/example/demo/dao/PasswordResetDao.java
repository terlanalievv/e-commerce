package com.example.demo.dao;

import com.example.demo.domain.PasswordReset;

import java.util.Optional;

public interface PasswordResetDao {

    boolean insertPasswordReset(PasswordReset passwordReset);

    Optional<PasswordReset> getPasswordResetByToken(String token);

    boolean updateUserStatus(String token);
}
