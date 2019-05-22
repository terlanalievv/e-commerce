package com.example.demo.dao;

import com.example.demo.domain.UserRole;

public interface UserRoleDao {

    boolean saveUserRole(UserRole userRole);
    boolean updateUserRoleStatus(int userId, int roleId);
}
