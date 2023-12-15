package com.Aditya.OOP.Exceptions;

import java.util.Scanner;

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
class AgeValidator{
    public static void validAge(int age) throws MyException{
        if(age < 0 || age > 130){
            throw new MyException("Age is not Valid");
        }
        System.out.println("Your Age is: " + age);
    }
}
public class Age {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter your age: ");
            int age = in.nextInt();
            AgeValidator.validAge(age);
        }catch (MyException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
