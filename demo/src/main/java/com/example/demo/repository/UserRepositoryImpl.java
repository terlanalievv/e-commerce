package com.example.demo.repository;

import com.example.demo.domain.Role;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

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

    /*public User insert(User user){
        Object[] data = {user.getName(), user.getSurname(),user.getEmail(),user.getPassword()};
        int count = jdbcTemplate.update(SqlQuery.INSERT_USER, data);
        System.out.println("insert count = " + count);
        return user;
    }
    public User authenticate (User user){
        Object[] data = {user.getEmail(),user.getPassword()};
          jdbcTemplate.update(SqlQuery.AUTHENTICATE_USER,data);
//        String sql=SqlQuery.AUTHENTICATE_USER;
//        List<Map<String, Object>> count = jdbcTemplate.queryForList(sql,data);
        //System.out.println("count = " + count);
        return user;
    }*/
}
