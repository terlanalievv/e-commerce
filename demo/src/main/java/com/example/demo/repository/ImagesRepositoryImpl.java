package com.example.demo.repository;

import com.example.demo.domain.Images;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
}
