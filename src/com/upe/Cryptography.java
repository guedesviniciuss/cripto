package com.upe;

import java.nio.charset.StandardCharsets;

public class Cryptography {
    private Integer factor;

    public Cryptography(int factor) {
        this.factor = factor;
    }

    public String encrypte(String password) {
        String encriptedPassword = "";
        byte[] bytes;

        bytes = password.getBytes(StandardCharsets.US_ASCII);

        for (int i = 0; i < bytes.length; i++) {
            if(i == bytes.length - 1) {
                encriptedPassword += bytes[i] + factor;
            } else {
                encriptedPassword += bytes[i] + factor + "#";
            }
        }
        return encriptedPassword;
    }

    public String decrypt(String password) {
        String[] cleanedPassword = password.split("#");
        String decryptedPassword = "";

        for (int i = 0; i < cleanedPassword.length; i++) {
            char convertedChar = (char)  (Integer.parseInt(cleanedPassword[i]) - factor);
            decryptedPassword += String.valueOf(convertedChar);
        }

        return decryptedPassword;
    }
}
