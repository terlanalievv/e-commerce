package com.example.demo.repository;

import com.example.demo.domain.Category;
import com.example.demo.domain.City;
import com.example.demo.domain.Elan;
import com.example.demo.domain.User;
import com.example.demo.enums.AnnouncementStatus;
import com.example.demo.enums.Currency;
import com.example.demo.enums.Status;
import com.example.demo.mappers.ElanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ElanRepositoryImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean saveElan(Elan elan){

        boolean insertResult = false;
        Object[] data = {elan.getId(), elan.getProductName(), elan.getProductInfo(),elan.getCategory().getId(),
                elan.getProductPrice(), elan.getCurrency().getLabel(), elan.getCity().getId(),
                elan.getPrefix() + " " + elan.getPhoneNumber(), elan.getEmail(), elan.getStatus().getValue(),
                elan.getAnnouncementStatus().getCode(), elan.getExpireDate(), elan.getAddedDate(), elan.getUser().getUserId()};
        int count = jdbcTemplate.update(SqlQuery.SAVE_ELAN, data);
        if(count > 0){
            insertResult = true;
        }
        return insertResult;
    }

    public void updateElanAnnouncementStatus(int elanId, int announcementStatus){

        Object[] data = {announcementStatus, elanId};
        jdbcTemplate.update(SqlQuery.UPDATE_ELAN_ANNOUNCEMENT_STATUS, data);
    }

    public void updateElanStatus(int elanId, int status){

        Object[] data = {status, elanId};
        jdbcTemplate.update(SqlQuery.UPDATE_ELAN_STATUS, data);
    }

    public int getElanSeqValue(){
        Integer seqValue = jdbcTemplate.queryForObject(SqlQuery.GET_ELAN_SEQ_VALUE, Integer.class);
        return seqValue;
    }

    public List<Elan> getAllElans(){

        List<Elan> elanList = new ArrayList<>();
        try {
            elanList = jdbcTemplate.query(SqlQuery.GET_ALL_ELANS, new ElanMapper());
            return elanList;
        } catch (Exception e){
            e.printStackTrace();
            return elanList;
        }

    }

    public List<Elan> getElan(int elanId){

        List<Elan> elanList = new ArrayList<>();
        try {
            elanList = jdbcTemplate.query(SqlQuery.GET_ELAN, new Object[]{elanId}, new ResultSetExtractor<List<Elan>>() {

                @Override
                public List<Elan> extractData(ResultSet rs) throws SQLException, DataAccessException {

                    List<Elan> elans = new ArrayList<>();
                    while (rs.next()){
                        Category category = new Category();
                        City city = new City();
                        Elan elan = new Elan();
                        elan.setId(rs.getInt("id"));
                        elan.setProductName(rs.getString("product_name"));
                        elan.setProductInfo(rs.getString("product_info"));

                        String categoryName = rs.getString("category_name");
                        category.setName(categoryName);
                        elan.setCategory(category);

                        String cityName = rs.getString("city_name");
                        city.setName(cityName);
                        elan.setCity(city);

                        elan.setPhoneNumber(rs.getString("phone"));
                        elan.setEmail(rs.getString("email"));
                        elan.setAddedDate(rs.getTimestamp("added_date").toLocalDateTime());
                        elan.setProductPrice(rs.getString("product_price"));

                        String currency = rs.getString("currency");
                        if(currency.equals("AZN")){
                            elan.setCurrency(Currency.AZN);
                        } else if(currency.equals("EUR")){
                            elan.setCurrency(Currency.EUR);
                        } else if(currency.equals("USD")){
                            elan.setCurrency(Currency.USD);
                        }

                        elan.setImage(rs.getString("image_name"));
                        elans.add(elan);
                    }
                    return elans;
                }
            });
            return elanList;
        } catch (Exception e){
            return elanList;
        }
    }


    public List<Elan> allElans(){

        List<Elan> elanList = new ArrayList<>();
        try {
            elanList = jdbcTemplate.query(SqlQuery.ALL_ELANS, new ResultSetExtractor<List<Elan>>() {

                @Override
                public List<Elan> extractData(ResultSet rs) throws SQLException, DataAccessException {

                    List<Elan> elans = new ArrayList<>();
                    while (rs.next()){
                        Elan elan = new Elan();
                        User user = new User();
                        elan.setId(rs.getInt("id"));
                        elan.setProductName(rs.getString("product_name"));

                        int status = rs.getInt("status");
                        switch (status) {
                            case 0:
                                elan.setStatus(Status.DEACTIVE);
                                break;
                            case 1:
                                elan.setStatus(Status.ACTIVE);
                                break;
                        }

                        int announcementStatus = rs.getInt("announcement_status");
                        switch (announcementStatus) {
                            case 0:
                                elan.setAnnouncementStatus(AnnouncementStatus.PENDING);
                                break;
                            case 1:
                                elan.setAnnouncementStatus(AnnouncementStatus.APPROVED);
                                break;
                            case 2:
                                elan.setAnnouncementStatus(AnnouncementStatus.IGNORED);
                                break;
                            case 3:
                                elan.setAnnouncementStatus(AnnouncementStatus.DELETED);
                                break;
                        }

                        user.setUserId(rs.getInt("user_id"));
                        user.setName(rs.getString("name"));
                        user.setSurname(rs.getString("surname"));
                        elan.setUser(user);

                        elan.setAddedDate(rs.getTimestamp("added_date").toLocalDateTime());
                        elan.setExpireDate(rs.getTimestamp("expire_date").toLocalDateTime());
                        elans.add(elan);
                    }
                    return elans;
                }
            });
            return elanList;
        } catch (Exception e){
            return elanList;
        }
    }

     // admin elana click edende elanin butun melumatlarini getirsin
    public List<Elan> getElanForAdmin(int elanId){

        List<Elan> elanList = new ArrayList<>();
        try {
            elanList = jdbcTemplate.query(SqlQuery.GET_ELAN_FOR_ADMIN, new Object[]{elanId}, new ResultSetExtractor<List<Elan>>() {

                @Override
                public List<Elan> extractData(ResultSet rs) throws SQLException, DataAccessException {

                    List<Elan> elans = new ArrayList<>();
                    while (rs.next()){
                        Category category = new Category();
                        City city = new City();
                        Elan elan = new Elan();
                        User user = new User();
                        elan.setId(rs.getInt("id"));
                        elan.setProductName(rs.getString("product_name"));
                        elan.setProductInfo(rs.getString("product_info"));

                        category.setId(rs.getInt("cat_id"));
                        category.setName(rs.getString("category_name"));
                        elan.setCategory(category);

                        city.setId(rs.getInt("city_id"));
                        city.setName(rs.getString("city_name"));
                        elan.setCity(city);

                        elan.setPhoneNumber(rs.getString("phone"));
                        elan.setEmail(rs.getString("email"));

                        int status = rs.getInt("status");
                        switch (status){
                            case 0:
                                elan.setStatus(Status.DEACTIVE);
                                break;
                            case 1:
                                elan.setStatus(Status.ACTIVE);
                                break;
                        }

                        int announcement_status = rs.getInt("announcement_status");
                        switch (announcement_status){
                            case 0:
                                elan.setAnnouncementStatus(AnnouncementStatus.PENDING);
                                break;
                            case 1:
                                elan.setAnnouncementStatus(AnnouncementStatus.APPROVED);
                                break;
                            case 2:
                                elan.setAnnouncementStatus(AnnouncementStatus.IGNORED);
                                break;
                            case 3:
                                elan.setAnnouncementStatus(AnnouncementStatus.DELETED);
                                break;
                        }

                        elan.setExpireDate(rs.getTimestamp("expire_date").toLocalDateTime());
                        elan.setAddedDate(rs.getTimestamp("added_date").toLocalDateTime());
                        elan.setProductPrice(rs.getString("product_price"));

                        String currency = rs.getString("currency");
                        if(currency.equals("AZN")){
                            elan.setCurrency(Currency.AZN);
                        } else if(currency.equals("EUR")){
                            elan.setCurrency(Currency.EUR);
                        } else if(currency.equals("USD")){
                            elan.setCurrency(Currency.USD);
                        }

                        user.setUserId(rs.getInt("user_id"));
                        user.setName(rs.getString("name"));
                        user.setSurname(rs.getString("surname"));
                        user.setEmail(rs.getString("email"));
                        elan.setUser(user);
                        elans.add(elan);
                    }
                    return elans;
                }
            });
            return elanList;
        } catch (Exception e){
            return elanList;
        }
    }

    public List<Elan> getElanById(long userId){
        List<Elan> elanList = new ArrayList<>();
        try {
            elanList = jdbcTemplate.query(SqlQuery.GET_ELAN_BY_ID, new Object[]{userId}, new ResultSetExtractor<List<Elan>>() {

                @Override
                public List<Elan> extractData(ResultSet rs) throws SQLException, DataAccessException {

                    List<Elan> elans = new ArrayList<>();
                    while (rs.next()){
                        Category category = new Category();
                        City city = new City();
                        Elan elan = new Elan();
                        User user = new User();
                        elan.setId(rs.getInt("id"));
                        elan.setProductName(rs.getString("product_name"));
                        elan.setProductInfo(rs.getString("product_info"));

                        category.setId(rs.getInt("cat_id"));
                        category.setName(rs.getString("category_name"));
                        elan.setCategory(category);

                        city.setId(rs.getInt("city_id"));
                        city.setName(rs.getString("city_name"));
                        elan.setCity(city);

                        elan.setPhoneNumber(rs.getString("phone"));
                        elan.setEmail(rs.getString("email"));

                        int status = rs.getInt("status");
                        switch (status){
                            case 0:
                                elan.setStatus(Status.DEACTIVE);
                                break;
                            case 1:
                                elan.setStatus(Status.ACTIVE);
                                break;
                        }

                        int announcement_status = rs.getInt("announcement_status");
                        switch (announcement_status){
                            case 0:
                                elan.setAnnouncementStatus(AnnouncementStatus.PENDING);
                                break;
                            case 1:
                                elan.setAnnouncementStatus(AnnouncementStatus.APPROVED);
                                break;
                            case 2:
                                elan.setAnnouncementStatus(AnnouncementStatus.IGNORED);
                                break;
                            case 3:
                                elan.setAnnouncementStatus(AnnouncementStatus.DELETED);
                                break;
                        }

                        elan.setExpireDate(rs.getTimestamp("expire_date").toLocalDateTime());
                        elan.setAddedDate(rs.getTimestamp("added_date").toLocalDateTime());
                        elan.setProductPrice(rs.getString("product_price"));

                        String currency = rs.getString("currency");
                        if(currency.equals("AZN")){
                            elan.setCurrency(Currency.AZN);
                        } else if(currency.equals("EUR")){
                            elan.setCurrency(Currency.EUR);
                        } else if(currency.equals("USD")){
                            elan.setCurrency(Currency.USD);
                        }

                        user.setUserId(rs.getInt("user_id"));
                        user.setName(rs.getString("name"));
                        user.setSurname(rs.getString("surname"));
                        user.setEmail(rs.getString("email"));
                        elan.setUser(user);
                        elans.add(elan);
                    }
                    return elans;
                }
            });
            return elanList;
        } catch (Exception e){
            return elanList;
        }
    }


    public List<Elan> getMyProducts(int userId){

        List<Elan> elanList = new ArrayList<>();
        try {
            elanList = jdbcTemplate.query(SqlQuery.GET_MY_PRODUCTS, new Object[]{userId}, new ResultSetExtractor<List<Elan>>() {

                @Override
                public List<Elan> extractData(ResultSet resultSet) throws SQLException, DataAccessException {

                    List<Elan> elans = new ArrayList<>();
                    while (resultSet.next()){
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
                        elans.add(elan);
                    }
                    return elans;
                }
            });
            return elanList;
        } catch (Exception e){
            return elanList;
        }
    }

    public List<Elan> searchProducts(String name){

        String sql = "select distinct on(e.id) e.id, e.product_name, e.product_price, e.currency, i.name as image_name from public.elan e inner join public.images i on e.id = i.elan_id where status = 1 and announcement_status = 1  and expire_date >= current_timestamp::timestamp and lower(e.product_name) like lower('%"+ name + "%')";
        List<Elan> elanList = new ArrayList<>();
        try {
            elanList = jdbcTemplate.query(sql, new ResultSetExtractor<List<Elan>>() {

                @Override
                public List<Elan> extractData(ResultSet resultSet) throws SQLException, DataAccessException {

                    List<Elan> elans = new ArrayList<>();
                    while (resultSet.next()){
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
                        elans.add(elan);
                    }
                    return elans;
                }
            });
            return elanList;
        } catch (Exception e){
            return elanList;
        }
    }
}
