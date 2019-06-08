package com.example.demo.dao.implementation;


import com.example.demo.dao.ElanDao;
import com.example.demo.domain.Elan;
import com.example.demo.repository.ElanRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ElanDaoImpl implements ElanDao {

    @Autowired
    private ElanRepositoryImpl elanRepository;

    @Override
    public boolean saveElan(Elan elan) {
        return elanRepository.saveElan(elan);
    }

    @Override
    public int getElanSeqValue() {
        return elanRepository.getElanSeqValue();
    }

    @Override
    public List<Elan> getAllElans() {
        return elanRepository.getAllElans();
    }

    @Override
    public List<Elan> getElan(int elanId) {
        return elanRepository.getElan(elanId);
    }

    @Override
    public List<Elan> allElans() {
        return elanRepository.allElans();
    }

    @Override
    public List<Elan> getElanForAdmin(int elanId) {
        return elanRepository.getElanForAdmin(elanId);
    }

    @Override
    public List<Elan> getElanById(long userId) {
        return elanRepository.getElanById(userId);
    }

    @Override
    public void updateElanAnnouncementStatus(int elanId, int announcementStatus) {
        elanRepository.updateElanAnnouncementStatus(elanId, announcementStatus);
    }

    @Override
    public void updateElanStatus(int elanId, int status) {
        elanRepository.updateElanStatus(elanId, status);
    }

    @Override
    public List<Elan> getMyProducts(int userId) {
        return elanRepository.getMyProducts(userId);
    }

    @Override
    public List<Elan> searchProducts(String name) {
        return elanRepository.searchProducts(name);
    }
}

