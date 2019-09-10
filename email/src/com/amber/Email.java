package com.amber;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private int mailboxCapacity;
    private String altEmail;

    //constructor
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created:" + firstName + lastName);
        // ask dept
        this.department = new Department().askDept();

    }
    //ask dept



    //generate password

    //set mailbox capacity

    //set alt email

    //Change Password

    public void setEmail(){
        this.email = firstName + "." + lastName + "@" + department + ".company.com";
    }
    public String getEmail(){
        return email;
    }
}
