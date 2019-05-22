package com.example.demo.dao.implementation;


import com.example.demo.dao.ElanDao;
import com.example.demo.domain.Elan;
import com.example.demo.repository.ElanRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}

