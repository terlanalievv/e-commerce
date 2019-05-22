package com.example.demo.dao.implementation;

import com.example.demo.dao.ImagesDao;
import com.example.demo.domain.Images;
import com.example.demo.repository.ImagesRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImagesDaoImpl implements ImagesDao {

    @Autowired
    private ImagesRepositoryImpl imagesRepository;

    @Override
    public boolean saveImages(Images images) {
        return imagesRepository.saveImages(images);
    }
}
