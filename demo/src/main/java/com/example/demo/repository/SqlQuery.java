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
}
