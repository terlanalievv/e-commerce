package com.example.demo.service.implementation;

import com.example.demo.dao.UserRoleDao;
import com.example.demo.domain.UserRole;
import com.example.demo.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public boolean saveUserRole(UserRole userRole) {
        return userRoleDao.saveUserRole(userRole);
    }

    @Override
    public boolean updateUserRoleStatus(int userId, int roleId) {
        return userRoleDao.updateUserRoleStatus(userId, roleId);
    }
}
