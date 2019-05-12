package com.example.demo.repository;

public class SqlQuery {

    public static final String INSERT_USER = "INSERT INTO public.bizim_admin( " +
            " id, name, surname, email, password)" +
            " VALUES (nextval('admin_seq'), ?, ?, ?, ?)";
    public static final String AUTHENTICATE_USER = "SELECT email, password " +
            "FROM public.bizim_admin " +
            " where email=? and password=?";

    public static final String GET_USER_BY_USERNAME = "select user_id, name, surname, email, password, phone from " +
            "public.user where email=?";

    public static final String GET_USER_ROLES_BY_USER_ID = "select r.role_id, r.role_name from " +
            "role r inner join user_role ur on r.role_id = ur.role_id inner join " +
            "user u on u.user_id = ur.user_id where u.user_id = ?";

    public static final String GET_USER_BY_TOKEN = "select id, pin_code, email, password, first_name, last_name, gender, phone1, phone2, " +
            " birth_date, registration_date, token, token_expire_date, " +
            " sms_verification_code, sms_verification_status, sms_verification_date, " +
            " activation_date, last_update, user_status, user_type, status from users where status = 1 and token = ?";

}
