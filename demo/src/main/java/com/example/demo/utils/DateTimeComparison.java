package com.example.demo.utils;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeComparison {

    public static boolean compareDateTime(LocalDateTime tokenExpDate){

        LocalDateTime tempDateTime = LocalDateTime.now();
        long years = tempDateTime.until(tokenExpDate, ChronoUnit.YEARS);
        long months = tempDateTime.until(tokenExpDate, ChronoUnit.MONTHS);
        long days = tempDateTime.until(tokenExpDate, ChronoUnit.DAYS);
        long hours = tempDateTime.until(tokenExpDate, ChronoUnit.HOURS);

        if(years == 0 && months == 0 && days == 0 && hours < 24){
            return true;
        } else {
            return false;
        }
    }
}
