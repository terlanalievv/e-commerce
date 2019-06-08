package com.example.demo.repository;

import com.example.demo.domain.Role;
import com.example.demo.domain.User;
import com.example.demo.enums.Status;
import com.example.demo.mappers.RoleMapper;
import com.example.demo.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static com.example.demo.repository.SqlQuery.GET_ALL_USERS;

@Repository
public class UserRepositoryImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Optional<User> getUserByEmail(String email){

        Optional<User> optionalUser = Optional.empty();
        try {
            User user = jdbcTemplate.queryForObject(SqlQuery.GET_USER_BY_USERNAME, new Object[]{email}, new UserMapper());
            if (user != null) {
                user.setRoles(getUserRoles(user.getUserId()));
                optionalUser = Optional.of(user);
            }
            return optionalUser;
        } catch (Exception e){
            return optionalUser;
        }
    }

    public Optional<User> getUserByToken(String token){

        Optional<User> optionalUser = Optional.empty();
        try {
            User user = jdbcTemplate.queryForObject(SqlQuery.GET_USER_BY_TOKEN, new Object[]{token}, new UserMapper());
            optionalUser = Optional.of(user);
            return optionalUser;
        } catch (Exception e){
            return optionalUser;
        }

    }

    private Set<Role> getUserRoles(long userId){
        List<Role> roles = jdbcTemplate.query(SqlQuery.GET_USER_ROLES_BY_USER_ID, new Object[]{userId},new RoleMapper());
        Set<Role> roleSet = new HashSet<>(roles);
        return roleSet;
    }

    public boolean insertUser(User user){
        boolean insertResult = false;
        Object[] data = {user.getUserId(), user.getName(), user.getSurname(),user.getEmail(),user.getPassword(),
                user.getPhone(), user.getStatus().getValue(),
                user.getToken(),user.getTokenExpireDate(),user.getRegistrationDate()};
        int count = jdbcTemplate.update(SqlQuery.SAVE_USER, data);
        if(count > 0){
            insertResult = true;
        }
        return insertResult;
    }

    public boolean updateUserStatus(long userId){
        boolean updateResult = false;
        Object[] data = {userId};
        int count = jdbcTemplate.update(SqlQuery.UPDATE_USER_STATUS, data);
        if(count > 0){
            updateResult = true;
        }
        return updateResult;
    }

    public boolean updateUserPassword(String email, String password){
        boolean passwordResetResult = false;
        try {
            Object[] data = {password, email};
            int count = jdbcTemplate.update(SqlQuery.UPDATE_USER_PASSWORD, data);
            if(count > 0){
                passwordResetResult = true;
            }
            return passwordResetResult;
        } catch (Exception e){
            e.printStackTrace();
            return passwordResetResult;
        }
    }

    public int getUserSeqValue(){
        Integer seqValue = jdbcTemplate.queryForObject(SqlQuery.GET_SEQ_VALUE, Integer.class);
        return seqValue;
    }

    public boolean checkUserEmail(String email){

        boolean checkEmailResult = false;
        try {
            Integer userId = jdbcTemplate.queryForObject(SqlQuery.CHECK_USER_EMAIL, new Object[]{email}, Integer.class);
            if (userId > 0) {
                checkEmailResult = true;
            }
            return checkEmailResult;
        } catch (Exception e){
            return checkEmailResult;
        }
    }

    public List<User> getAllUsers(){
        List<User> userList = jdbcTemplate.query(GET_ALL_USERS, new UserMapper());
        return userList;
    }

    public List<User> allUsers(){

        List<User> userList = new ArrayList<>();
        try {
            userList = jdbcTemplate.query(SqlQuery.GET_ALL_USERS, new ResultSetExtractor<List<User>>() {

                @Override
                public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException {

                    List<User> users = new ArrayList<>();
                    while (rs.next()){
                        User user = new User();
                        user.setUserId(rs.getInt("user_id"));
                        user.setName(rs.getString("name"));
                        user.setSurname(rs.getString("surname"));
                        user.setEmail(rs.getString("email"));
                        user.setPassword(rs.getString("password"));
                        user.setPhone(rs.getString("phone"));
                        if(rs.getInt("status") == 0){
                            user.setStatus(Status.DEACTIVE);
                        } else {
                            user.setStatus(Status.ACTIVE);
                        }
                        user.setRegistrationDate(rs.getTimestamp("registration_date").toLocalDateTime());
                        users.add(user);
                    }
                    return users;
                }
            });
            return userList;

        } catch (Exception e){
            return userList;
        }
    }


}
