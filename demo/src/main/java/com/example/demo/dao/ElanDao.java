package com.example.demo.dao;
import com.example.demo.domain.Elan;

public interface ElanDao {

    boolean saveElan(Elan elan);
    int getElanSeqValue();
}
