package com.online.restaurant.utils;

import java.util.Random;

public class PasswordGenrator {
    public static  String getPassword() {
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String loweAlphabets = alphabets.toLowerCase();
        String digits = "0123456789";
        String alphanumeric = alphabets + loweAlphabets + digits;
        System.out.println(alphanumeric);

        Random random = new Random();
        String password = "";
        for (int i=0; i < 8; i++) {
            int randomIndex = random.nextInt(alphanumeric.length());
            char character = alphanumeric.charAt(randomIndex);
            password= password + character;
            System.out.println("Random Index " + randomIndex
                    + " and Character: " + character);
        }
        System.out.println("System Generated Password is " + password );
        return password;
    }

    public static void main(String[] args){
        PasswordGenrator.getPassword();
    }
}
