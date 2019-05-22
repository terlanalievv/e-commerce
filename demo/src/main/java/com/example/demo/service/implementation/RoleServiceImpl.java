package com.example.demo.service.implementation;

import com.example.demo.dao.RoleDao;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public int getRoleId() {
        return roleDao.getRoleId();
    }
}
