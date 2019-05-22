package com.example.demo.utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.UUID;

public class TokenGenerator {

    public static String createToken(){

        /*UUID uuid = UUID.randomUUID();
        String input = uuid.toString();

        String token = DigestUtils.sha256Hex(input);
        return token;*/

        return DigestUtils.sha256Hex(UUID.randomUUID().toString());
    }
}
