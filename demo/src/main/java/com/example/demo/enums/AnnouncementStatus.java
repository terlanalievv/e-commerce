package com.example.demo.enums;

public enum AnnouncementStatus {

    PENDING(0),APPROVED(1),IGNORED(2), DELETED(3);

    private int code;

    AnnouncementStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return this.code;
    }
}
