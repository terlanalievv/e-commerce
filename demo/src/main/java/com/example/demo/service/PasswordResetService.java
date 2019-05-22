package com.example.demo.service;

import com.example.demo.domain.PasswordReset;

import java.util.Optional;

public interface PasswordResetService {

    boolean insertPasswordReset(PasswordReset passwordReset);

    Optional<PasswordReset> getPasswordResetByToken(String token);

    boolean updateUserStatus(String token);
}
