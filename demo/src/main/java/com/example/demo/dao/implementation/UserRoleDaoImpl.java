package com.example.demo.dao.implementation;

import com.example.demo.dao.UserRoleDao;
import com.example.demo.domain.UserRole;
import com.example.demo.repository.UserRoleRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRoleDaoImpl implements UserRoleDao {

    @Autowired
    private UserRoleRepositoryImpl userRoleRepository;

    @Override
    public boolean saveUserRole(UserRole userRole) {
        return userRoleRepository.saveUserRole(userRole);
    }

    @Override
    public boolean updateUserRoleStatus(int userId, int roleId) {
        return userRoleRepository.updateUserRoleStatus(userId, roleId);
    }
}
