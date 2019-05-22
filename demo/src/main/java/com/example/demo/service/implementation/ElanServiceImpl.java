package com.example.demo.service.implementation;


import com.example.demo.dao.ElanDao;
import com.example.demo.domain.Elan;
import com.example.demo.service.ElanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
