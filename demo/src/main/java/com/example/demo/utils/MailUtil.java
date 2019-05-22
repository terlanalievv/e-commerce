package com.example.demo.utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailUtil {

    public static boolean sendEmail(String email, String link) {
        String username = "shshoppingaz489@gmail.com";
        String password = "rpcdbjbmudqsntsj";

        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(properties,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("Confirmation");
            message.setText(link);
            Transport.send(message);
            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
    }
}
