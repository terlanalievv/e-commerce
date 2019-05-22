package com.example.demo.service;

import com.example.demo.domain.UserRole;

public interface UserRoleService {

    boolean saveUserRole(UserRole userRole);
    boolean updateUserRoleStatus(int userId, int roleId);
}
