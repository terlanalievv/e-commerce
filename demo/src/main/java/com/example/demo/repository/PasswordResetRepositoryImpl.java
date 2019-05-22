package com.example.demo.repository;

import com.example.demo.domain.PasswordReset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PasswordResetRepositoryImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean insertPasswordReset(PasswordReset passwordReset){

        boolean insertResult = false;
        Object[] data = {passwordReset.getEmail(), passwordReset.getToken(), passwordReset.getTokenExpireDate(), passwordReset.getStatus().getValue()};
        int count = jdbcTemplate.update(SqlQuery.SAVE_PASSWORD_RESET, data);
        if(count > 0){
            insertResult = true;
        }
        return insertResult;
    }

    public Optional<PasswordReset> getPasswordResetByToken(String token){

        Optional<PasswordReset> optionalPasswordReset = Optional.empty();
        PasswordReset passwordReset = jdbcTemplate.queryForObject(SqlQuery.GET_PASSWORD_RESET_BY_TOKEN, new Object[]{token}, new PasswordResetMapper());
        optionalPasswordReset = Optional.of(passwordReset);
        return optionalPasswordReset;
    }

    public boolean updateUserStatus(String token){
        boolean updateResult = false;
        Object[] data = {token};
        int count = jdbcTemplate.update(SqlQuery.UPDATE_PASSWORD_RESET_STATUS, data);
        if(count > 0){
            updateResult = true;
        }
        return updateResult;
    }
}
