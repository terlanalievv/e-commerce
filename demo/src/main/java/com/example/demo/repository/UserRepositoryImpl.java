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
        User user = jdbcTemplate.queryForObject(SqlQuery.GET_USER_BY_USERNAME, new Object[]{email}, new UserMapper());
        if (user != null) {
            user.setRoles(getUserRoles(user.getUserId()));
            optionalUser = Optional.of(user);
        }
        return optionalUser;
    }

    private Set<Role> getUserRoles(long userId){
        List<Role> roles = jdbcTemplate.query(SqlQuery.GET_USER_ROLES_BY_USER_ID, new Object[]{userId},new RoleMapper());
        Set<Role> roleSet = new HashSet<>(roles);
        return roleSet;
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
