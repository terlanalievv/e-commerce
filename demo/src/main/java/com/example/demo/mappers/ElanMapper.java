package com.example.demo.mappers;

import com.example.demo.domain.Category;
import com.example.demo.domain.City;
import com.example.demo.domain.Elan;
import com.example.demo.enums.AnnouncementStatus;
import com.example.demo.enums.Currency;
import com.example.demo.enums.Status;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ElanMapper implements RowMapper<Elan> {

    @Override
    public Elan mapRow(ResultSet resultSet, int i) throws SQLException {
        Elan elan = new Elan();
        elan.setId(resultSet.getInt("id"));
        elan.setProductName(resultSet.getString("product_name"));
        elan.setProductPrice(resultSet.getString("product_price"));
        String currency = resultSet.getString("currency");
        if(currency.equals("AZN")){
            elan.setCurrency(Currency.AZN);
        } else if(currency.equals("EUR")){
            elan.setCurrency(Currency.EUR);
        } else if(currency.equals("USD")){
            elan.setCurrency(Currency.USD);
        }
        elan.setImage(resultSet.getString("image_name"));
        return elan;
    }
}
