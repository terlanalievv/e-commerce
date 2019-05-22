package com.example.demo.repository;

import com.example.demo.domain.PasswordReset;
import com.example.demo.enums.Status;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PasswordResetMapper implements RowMapper<PasswordReset> {

    @Override
    public PasswordReset mapRow(ResultSet resultSet, int i) throws SQLException {
        PasswordReset passwordReset = new PasswordReset();
        passwordReset.setId(resultSet.getInt("id"));
        passwordReset.setEmail(resultSet.getString("email"));
        passwordReset.setToken(resultSet.getString("token"));
        passwordReset.setTokenExpireDate(resultSet.getTimestamp("token_exp_date").toLocalDateTime());
        if(resultSet.getInt("status") == 0){
            passwordReset.setStatus(Status.DEACTIVE);
        } else {
            passwordReset.setStatus(Status.ACTIVE);
        }
        return passwordReset;
    }
}
