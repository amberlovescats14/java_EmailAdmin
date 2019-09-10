package com.amber;

public class X_Email extends Email {
    private int mailboxCapacity = 500;
    private String altEmail;

    public X_Email(String firstName, String lastName) {
        super(firstName, lastName);
    }

    //if we need to change email capacity
    public void setMailboxCapacity(int capacity){

        this.mailboxCapacity = capacity;
    }

    public int getMailboxCapacity(){
        return this.mailboxCapacity;
    }

    //  alternate email
    //set alt email
    public void setAltEmail(String email){
        this.altEmail = email;
    }
}
