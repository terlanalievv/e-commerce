package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepositoryImpl;
import com.example.demo.utils.DateTimeComparison;
import com.example.demo.utils.MailUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.MessageDigest;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class TestMain {



    public static void main(String[] args) {

        /*String ad = "terlan";
        System.out.println(ad.length());

        Map<String, String> luget = new TreeMap<String, String>();
        luget.put("book", "kitab");
        luget.put("phone", "telefon");
        luget.put("car", "maşın");
        List<String> en = new ArrayList<String>();
        List<String> az = new ArrayList<String>();

        az.addAll(luget.values());
        en.addAll(luget.keySet());

        System.out.println("keyset = " + en);
        System.out.println("values = " + az);*/
        //MailUtil.sendEmail("turalsamadov@outlook.com", "<a href='#' style='box-shadow: 0px 0px 5px 0px rgba(0,0,0,0.75);text-decoration: none;padding: 12px 20px;background-color: blue;color: white;font-size: 20px;'>Sifreni yenile</a>");
        /*LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        LocalDateTime fromDateTime = LocalDateTime.parse("2019-05-15T23:20:30");
        LocalDateTime toDateTime = LocalDateTime.parse("2019-05-16T23:20:29");
        //DateTimeComparison.compareDateTime(fromDateTime);
        LocalDateTime tempDateTime = LocalDateTime.from(fromDateTime);

        long years = tempDateTime.until( toDateTime, ChronoUnit.YEARS);
        tempDateTime = tempDateTime.plusYears( years );

        long months = tempDateTime.until( toDateTime, ChronoUnit.MONTHS);
        tempDateTime = tempDateTime.plusMonths( months );

        long days = tempDateTime.until( toDateTime, ChronoUnit.DAYS);
        tempDateTime = tempDateTime.plusDays( days );


        long hours = tempDateTime.until( toDateTime, ChronoUnit.HOURS);
        tempDateTime = tempDateTime.plusHours( hours );

        long minutes = tempDateTime.until( toDateTime, ChronoUnit.MINUTES);
        tempDateTime = tempDateTime.plusMinutes( minutes );

        long seconds = tempDateTime.until( toDateTime, ChronoUnit.SECONDS);

        System.out.println( years + " years " +
                months + " months " +
                days + " days " +
                hours + " hours " +
                minutes + " minutes " +
                seconds + " seconds.");

        if(years == 0 && months == 0 && days == 0 && hours < 24){
            System.out.println("Kecerli tarix");
        } else {
            System.out.println("Kecersiz tarix");
        }*/

//        LocalDateTime today =  LocalDateTime.now();     //Today
//        System.out.println(today);
//        LocalDateTime tomorrow = today.plusDays(30);
//        System.out.println(tomorrow);

        LocalDateTime time1 = LocalDateTime.now();
        System.out.println(time1);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalDateTime time2 = LocalDateTime.now();
        System.out.println(time2);

        System.out.println(time2.isAfter(time1));

    }

    /*public String encodedPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(password);
        return encodedPassword;
    }*/

    /*public static String createToken(){

        *//*LocalDateTime localDateTime = LocalDateTime.now();
        String input = localDateTime.toString();*//*

        UUID uuid = UUID.randomUUID();
        String input = uuid.toString();
        System.out.println("input = " + input);

        String token = DigestUtils.sha256Hex(input);
        return token;
    }*/
}
