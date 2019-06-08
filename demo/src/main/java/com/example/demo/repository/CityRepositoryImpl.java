package com.example.demo.repository;

import com.example.demo.domain.City;
import com.example.demo.mappers.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityRepositoryImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<City> getCities(){
        List<City> cities = jdbcTemplate.query(SqlQuery.GET_CITIES, new CityMapper());
        return cities;
    }
}
