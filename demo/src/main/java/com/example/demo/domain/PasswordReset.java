package com.example.demo.domain;

import com.example.demo.enums.Status;

import java.time.LocalDateTime;

public class PasswordReset {

    private int id;
    private String email;
    private String token;
    private LocalDateTime tokenExpireDate;
    Status status;

    public PasswordReset() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDateTime getTokenExpireDate() {
        return tokenExpireDate;
    }

    public void setTokenExpireDate(LocalDateTime tokenExpireDate) {
        this.tokenExpireDate = tokenExpireDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
