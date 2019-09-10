package com.amber;

import java.util.Scanner;

public class Department implements I_Department {
    @Override
    public String askDept(){
        String department;
        Scanner scan = new Scanner(System.in);
        System.out.print("What department do you work in?");
        String answer = scan.nextLine();

        if(answer == "none" || answer == "")  return  "";
        else return answer;
    }
}
