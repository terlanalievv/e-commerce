package com.example.demo.dao.implementation;

import com.example.demo.dao.RoleDao;
import com.example.demo.repository.RoleRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl implements RoleDao {

    @Autowired
    private RoleRepositoryImpl roleRepository;

    @Override
    public int getRoleId() {
        return roleRepository.getRoleId();
    }
}
