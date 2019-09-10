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
        System.out.println("Email Created: " + firstName + " " + lastName);
        // ask dept
        setDept();
        //create password
        setPassword();

    }
    //set dept
    private void setDept(){
        this.department = new Department().askDept();
        System.out.println("Department Created: " + department);
    }
    private String getDepartment(){
        return this.department;
    }

    //generate password
    private void setPassword(){
        this.password = new Password().generatePassword(8);
    }
    private String getPassword(){
        return this.password;
    }
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
