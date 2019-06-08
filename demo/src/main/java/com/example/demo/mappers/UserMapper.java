package com.example.demo.mappers;

import com.example.demo.domain.User;
import com.example.demo.enums.Status;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setUserId(resultSet.getInt("user_id"));
        user.setName(resultSet.getString("name"));
        user.setSurname(resultSet.getString("surname"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setPhone(resultSet.getString("phone"));
        if(resultSet.getInt("status") == 0){
            user.setStatus(Status.DEACTIVE);
        } else {
            user.setStatus(Status.ACTIVE);
        }
        user.setToken(resultSet.getString("token"));
        user.setTokenExpireDate(resultSet.getTimestamp("token_exp_date").toLocalDateTime());
        return user;
    }
}
