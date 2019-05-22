package com.example.demo.service.implementation;

import com.example.demo.dao.ImagesDao;
import com.example.demo.domain.Images;
import com.example.demo.service.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ImagesServiceImpl implements ImagesService {

    @Autowired
    private ImagesDao imagesDao;

    @Override
    public boolean saveImages(Images images) {
        return imagesDao.saveImages(images);
    }
}
