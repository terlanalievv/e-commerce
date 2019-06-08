package com.example.demo.repository;

import com.example.demo.domain.Category;
import com.example.demo.mappers.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepositoryImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Category> getCategories(){
        List<Category> categories = jdbcTemplate.query(SqlQuery.GET_CATEGORIES, new CategoryMapper());
        return categories;
    }
}
