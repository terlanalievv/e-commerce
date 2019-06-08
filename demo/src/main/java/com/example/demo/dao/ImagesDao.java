package com.example.demo.dao;

import com.example.demo.domain.Images;

import java.util.List;

public interface ImagesDao {

    boolean saveImages(Images images);
    List<Images> getAllImages(int elanId);
}
