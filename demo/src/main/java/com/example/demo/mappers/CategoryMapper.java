package com.example.demo.mappers;

import com.example.demo.domain.Category;
import com.example.demo.enums.Status;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper implements RowMapper<Category> {

    @Override
    public Category mapRow(ResultSet resultSet, int i) throws SQLException {
        Category category = new Category();
        category.setId(resultSet.getInt("id"));
        category.setName(resultSet.getString("name"));
        if(resultSet.getInt("status") == 0){
            category.setStatus(Status.DEACTIVE);
        } else {
            category.setStatus(Status.ACTIVE);
        }
        return category;
    }
}
