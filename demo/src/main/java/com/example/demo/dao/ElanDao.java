package com.example.demo.dao;
import com.example.demo.domain.Elan;

import java.util.List;

public interface ElanDao {

    boolean saveElan(Elan elan);
    int getElanSeqValue();
    List<Elan> getAllElans();
    List<Elan> getElan(int elanId);
    List<Elan> allElans();
    List<Elan> getElanForAdmin(int elanId);
    List<Elan> getElanById(long userId);
    void updateElanAnnouncementStatus(int elanId, int announcementStatus);
    void updateElanStatus(int elanId, int status);
    List<Elan> getMyProducts(int userId);
    List<Elan> searchProducts(String name);
}
