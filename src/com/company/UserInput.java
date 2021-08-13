package com.company;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Enter name");

        String name=myScanner.nextLine();
        System.out.println("Name: "+name);
    }

}
