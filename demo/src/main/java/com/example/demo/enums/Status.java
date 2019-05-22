package com.example.demo.enums;

public enum Status {

    DEACTIVE(0),ACTIVE(1);

    private int code;

    Status(int code) {
        this.code = code;
    }

    public int getValue() {
        return this.code;
    }
}
