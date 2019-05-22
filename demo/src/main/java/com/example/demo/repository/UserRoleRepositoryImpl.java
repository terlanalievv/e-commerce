package com.example.demo.repository;

import com.example.demo.domain.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRoleRepositoryImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean saveUserRole(UserRole userRole){

        boolean insertResult = false;
        Object[] data = {userRole.getUserId(), userRole.getRoleId(),userRole.getStatus().getValue()};
        int count = jdbcTemplate.update(SqlQuery.SAVE_USER_ROLE, data);
        if(count > 0){
            insertResult = true;
        }
        return insertResult;
    }

    public boolean updateUserRoleStatus(int userId, int roleId){

        boolean updateResult = false;
        Object[] data = {userId, roleId};
        int count = jdbcTemplate.update(SqlQuery.UPDATE_USER_ROLE_STATUS, data);
        if(count > 0){
            updateResult = true;
        }
        return updateResult;
    }
}
