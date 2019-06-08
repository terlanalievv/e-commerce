package com.example.demo.repository;

public class SqlQuery {

    public static final String SAVE_USER = "insert into public.user(user_id, name, surname, email, password, phone, status, token, token_exp_date, registration_date) " +
            "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String UPDATE_USER_STATUS = "update public.user set status = 1 where user_id = ? and status = 0";

    public static final String UPDATE_USER_PASSWORD = "update public.user set password = ? where status = 1 and email = ?";

    public static final String UPDATE_USER_ROLE_STATUS = "update public.user_role set status = 1 where user_id = ? and role_id = ? and status=0";

    public static final String SAVE_USER_ROLE = "insert into public.user_role(id, user_id, role_id, status) " +
            "values(nextval('user_role_seq'), ?, ?, ?)";

    public static final String AUTHENTICATE_USER = "SELECT email, password " +
            "FROM public.bizim_admin " +
            " where email=? and password=?";

    public static final String GET_USER_BY_USERNAME = "select user_id, name, surname, email, password, phone, status, token, token_exp_date from " +
            "public.user where status = 1 and email=?";

    public static final String CHECK_USER_EMAIL = "select user_id from public.user where status = 1 and email=?";

    public static final String GET_USER_BY_TOKEN = "select user_id, name, surname, email, password, phone, status, token, token_exp_date from " +
            "public.user where token=?";

    public static final String GET_SEQ_VALUE = "select nextval('user_seq')";

    public static final String GET_ELAN_SEQ_VALUE = "select nextval('elan_seq')";

    public static final String GET_ROLE_ID = "select role_id from public.role where role_name='USER'";

    public static final String GET_USER_ROLES_BY_USER_ID = "select r.role_id, r.role_name from " +
            "public.role r inner join public.user_role ur on r.role_id = ur.role_id inner join " +
            "public.user u on u.user_id = ur.user_id where u.status = 1 and u.user_id = ?";

    public static final String GET_USER_BY_TOKEN_OLD = "select id, pin_code, email, password, first_name, last_name, gender, phone1, phone2, " +
            " birth_date, registration_date, token, token_expire_date, " +
            " sms_verification_code, sms_verification_status, sms_verification_date, " +
            " activation_date, last_update, user_status, user_type, status from users where status = 1 and token = ?";

    public static final String SAVE_PASSWORD_RESET = "insert into public.password_reset_and_logging(id, email, token, token_exp_date, status) " +
            "values(nextval('password_reset_seq'), ?, ?, ?, ?)";

    public static final String GET_PASSWORD_RESET_BY_TOKEN = "select id, email, token, token_exp_date, status from " +
            "public.password_reset_and_logging where token=?";

    public static final String UPDATE_PASSWORD_RESET_STATUS = "update public.password_reset_and_logging set status = 1 where token = ?";

    public static final String GET_CATEGORIES = "select id, name, status from public.category order by name asc";

    public static final String GET_CITIES = "select id, name from public.cities order by name asc";

    public static final String SAVE_ELAN = "insert into public.elan(id, product_name, product_info, category_id, " +
            "product_price, currency, city_id, phone, email, status, announcement_status, expire_date, added_date, user_id) " +
            "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String UPDATE_ELAN_ANNOUNCEMENT_STATUS = "update public.elan set announcement_status = ? where id = ?";

    public static final String UPDATE_ELAN_STATUS = "update public.elan set status = ? where id = ?";

    public static final String SAVE_IMAGES = "insert into public.images(id, name, elan_id) values(nextval('images_seq'), ?, ?)";

    public static final String GET_ALL_ELANS = "select distinct on(e.id) e.id, e.product_name, " +
            "e.product_price, e.currency, " +
            "i.name as image_name from public.elan e inner join public.images i " +
            "on e.id = i.elan_id where status = 1 and announcement_status = 1  and expire_date >= current_timestamp::timestamp";

    public static final String GET_ELAN = "select distinct on(e.id) e.id, e.product_name, e.product_info, ca.name as category_name, " +
            "ci.name as city_name, e.phone, e.email, e.added_date, e.product_price, e.currency, im.name as image_name " +
            "from public.elan e " +
            "inner join public.category ca on e.category_id = ca.id " +
            "inner join public.cities ci on e.city_id = ci.id " +
            "inner join public.images im on e.id = im.elan_id where e.status = 1 and e.announcement_status = 1 and e.id = ?";

    public static final String GET_ALL_IMAGES = "select id, name from public.images where elan_id = ?";

    public static final String ALL_ELANS = "select e.id, e.product_name, e.status, e.announcement_status, e.added_date, e.expire_date, u.user_id, u.name, u.surname " +
            "from public.elan e inner join public.user u on e.user_id = u.user_id order by e.id desc";

    // admin elana click edende elanin butun melumatlarini getirsin
    public static final String GET_ELAN_FOR_ADMIN = "select e.id, e.product_name, e.product_info, ca.id as cat_id, ca.name as category_name, ci.id as city_id, ci.name as city_name, e.phone, e.email," +
            "e.status, e.announcement_status, e.expire_date, e.added_date, e.product_price, e.currency, u.user_id, u.name, u.surname, u.email " +
            "from public.elan e " +
            "inner join public.category ca on e.category_id = ca.id " +
            "inner join public.cities ci on e.city_id = ci.id " +
            "inner join public.user u on e.user_id = u.user_id  " +
            "where e.id = ?";

    public static final String GET_ALL_USERS = "SELECT user_id, name, surname, email, password, phone, status, registration_date " +
            "FROM public.user";

    public static final String GET_ELAN_BY_ID = "SELECT id, product_name, product_info, category_id, city_id, phone, email, status, announcement_status, expire_date, added_date, product_price, currency, user_id " +
            "FROM public.elan where user_id = ?";

    public static final String GET_MY_PRODUCTS = "select distinct on(e.id) e.id, e.product_name, e.product_price, " +
            "e.currency, i.name as image_name from public.elan e inner join public.images i on e.id = i.elan_id where " +
            "status = 1 and announcement_status = 1  and expire_date >= current_timestamp::timestamp and e.user_id = ?";

    public static final String GET_SEARCH_PRODUCTS = "select distinct on(e.id) e.id, e.product_name, e.product_price, " +
            "e.currency, i.name as image_name from public.elan e inner join public.images i on e.id = i.elan_id where " +
            "status = 1 and announcement_status = 1  and expire_date >= current_timestamp::timestamp and lower(e.product_name) like lower('%?%')";

}
