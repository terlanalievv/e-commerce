package com.example.demo.dao.implementation;

import com.example.demo.dao.CityDao;
import com.example.demo.domain.City;
import com.example.demo.repository.CityRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityDaoImpl implements CityDao {

    @Autowired
    private CityRepositoryImpl cityRepository;

    @Override
    public List<City> getCities() {
        return cityRepository.getCities();
    }
}
