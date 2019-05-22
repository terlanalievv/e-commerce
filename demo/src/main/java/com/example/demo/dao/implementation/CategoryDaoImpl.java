package com.example.demo.dao.implementation;

import com.example.demo.dao.CategoryDao;
import com.example.demo.domain.Category;
import com.example.demo.repository.CategoryRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private CategoryRepositoryImpl categoryRepository;

    @Override
    public List<Category> getCategories() {
        return categoryRepository.getCategories();
    }
}
