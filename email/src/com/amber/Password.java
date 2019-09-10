package com.amber;

public class Password implements I_Password{
    @Override
    public String generatePassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int randomNumber = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomNumber);
        }
        return new String(password);    }
}
