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
            "product_price, currency, city_id, phone, email, status, announcement_status, expire_date, added_date) " +
            "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String SAVE_IMAGES = "insert into public.images(id, name, elan_id) values(nextval('images_seq'), ?, ?)";
}
