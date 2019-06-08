package com.example.demo.repository;

import com.example.demo.domain.Images;
import com.example.demo.mappers.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ImagesRepositoryImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean saveImages(Images images){
        boolean insertResult = false;
        Object[] data = {images.getName(), images.getElan().getId()};
        int count = jdbcTemplate.update(SqlQuery.SAVE_IMAGES, data);
        if(count > 0){
            insertResult = true;
        }
        return insertResult;
    }

    public List<Images> getAllImages(int elanId){

        List<Images> images = new ArrayList<>();
        try {
            images = jdbcTemplate.query(SqlQuery.GET_ALL_IMAGES, new Object[]{elanId}, new ImageMapper());
            return images;
        } catch (Exception e){
            return images;
        }
    }
}
