package com.example.demo.service.implementation;


import com.example.demo.dao.ElanDao;
import com.example.demo.domain.Elan;
import com.example.demo.service.ElanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ElanServiceImpl implements ElanService {

    @Autowired
    private ElanDao elanDao;

    @Override
    public boolean saveElan(Elan elan) {
        return elanDao.saveElan(elan);
    }

    @Override
    public int getElanSeqValue() {
        return elanDao.getElanSeqValue();
    }

    @Override
    public List<Elan> getAllElans() {
        return elanDao.getAllElans();
    }

    @Override
    public List<Elan> getElan(int elanId) {
        return elanDao.getElan(elanId);
    }

    @Override
    public List<Elan> allElans() {
        return elanDao.allElans();
    }

    @Override
    public List<Elan> getElanForAdmin(int elanId) {
        return elanDao.getElanForAdmin(elanId);
    }

    @Override
    public List<Elan> getElanById(long userId) {
        return elanDao.getElanById(userId);
    }

    @Override
    public void updateElanAnnouncementStatus(int elanId, int announcementStatus) {
        elanDao.updateElanAnnouncementStatus(elanId, announcementStatus);
    }

    @Override
    public void updateElanStatus(int elanId, int status) {
        elanDao.updateElanStatus(elanId, status);
    }

    @Override
    public List<Elan> getMyProducts(int userId) {
        return elanDao.getMyProducts(userId);
    }

    @Override
    public List<Elan> searchProducts(String name) {
        return elanDao.searchProducts(name);
    }
}
