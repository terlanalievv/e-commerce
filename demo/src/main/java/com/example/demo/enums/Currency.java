package com.example.demo.enums;

public enum Currency {

    AZN("AZN"), EUR("EUR"), USD("USD");

    private String label;

    Currency(String label){
        this.label = label;
    }

    public String getLabel(){
        return this.label;
    }
}
