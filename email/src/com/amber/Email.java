package com.amber;

public class Email  {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String companySuffix = "apple.com";
    private String password;
    private byte defaultPasswordLength = 8;
    private String altEmail = "none";


    //constructor
    public Email(String firstName, String lastName) {
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        System.out.println("Welcome " + firstName + " " + lastName);
        // ask dept
        setDept();
        //create password
        setPassword();
        // set email
        setEmail();

        //present emails and password
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);

    }
    //set dept
    private void setDept(){
        this.department = new Department().askDept();
        if(department == "") System.out.println("No department specified.");
    }
    public String getDepartment(){
        return this.department;
    }

    //generate password
    private void setPassword(){
        this.password = new Password().generatePassword(defaultPasswordLength);
    }
    private String getPassword(){
        return this.password;
    }
    public void changePassword(String password){
        this.password = password;
    }

    //Change Password

    private void setEmail(){
        this.email = firstName.toLowerCase() +
                "." + lastName.toLowerCase() +
                "@" + department + "." + companySuffix;
    }
    public String getEmail(){
        return email;
    }
}
