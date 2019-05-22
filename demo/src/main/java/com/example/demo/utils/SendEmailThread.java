package com.example.demo.utils;

public class SendEmailThread implements Runnable {

    private String email;
    private String link;

    public SendEmailThread(String email, String link) {
        this.email = email;
        this.link = link;
    }

    @Override
    public void run() {
        try {
            MailUtil.sendEmail(email, link);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
