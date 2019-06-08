package com.example.demo.mappers;

import com.example.demo.domain.Images;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageMapper implements RowMapper<Images> {
    @Override
    public Images mapRow(ResultSet rs, int i) throws SQLException {
        Images image = new Images();
        image.setId(rs.getInt("id"));
        image.setName(rs.getString("name"));
        return image;
    }
}
