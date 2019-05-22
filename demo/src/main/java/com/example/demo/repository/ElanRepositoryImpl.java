package com.example.demo.repository;

import com.example.demo.domain.Elan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ElanRepositoryImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean saveElan(Elan elan){

        boolean insertResult = false;
        Object[] data = {elan.getId(), elan.getProductName(), elan.getProductInfo(),elan.getCategory().getId(),
                elan.getProductPrice(), elan.getCurrency().getLabel(), elan.getCity().getId(),
                elan.getPrefix() + " " + elan.getPhoneNumber(), elan.getEmail(), elan.getStatus().getValue(),
                elan.getAnnouncementStatus().getCode(), elan.getExpireDate(), elan.getAddedDate()};
        int count = jdbcTemplate.update(SqlQuery.SAVE_ELAN, data);
        if(count > 0){
            insertResult = true;
        }
        return insertResult;
    }

    public int getElanSeqValue(){
        Integer seqValue = jdbcTemplate.queryForObject(SqlQuery.GET_ELAN_SEQ_VALUE, Integer.class);
        return seqValue;
    }
}
