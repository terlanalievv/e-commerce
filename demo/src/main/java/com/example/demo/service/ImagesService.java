package com.example.demo.service;

import com.example.demo.domain.Images;

import java.util.List;

public interface ImagesService {

    boolean saveImages(Images images);
    List<Images> getAllImages(int elanId);
}
