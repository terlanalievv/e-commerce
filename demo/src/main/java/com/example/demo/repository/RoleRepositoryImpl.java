package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RoleRepositoryImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getRoleId(){
        Integer roleId = jdbcTemplate.queryForObject(SqlQuery.GET_ROLE_ID, Integer.class);
        return roleId;
    }
}
