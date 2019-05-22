package com.example.demo.service;

import com.example.demo.domain.Elan;

public interface ElanService {

    boolean saveElan(Elan elan);
    int getElanSeqValue();
}
