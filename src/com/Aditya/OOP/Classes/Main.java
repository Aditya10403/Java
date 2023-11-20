package com.Aditya.OOP.Classes;

import java.util.Scanner;

class Customer {
    private String name;
    private String pan_no;
    private static String email_id;
    private int salary;

    public Customer(String name, String panNo, String emailId, int salary) {
        this.name = name;
        pan_no = panNo;
        email_id = emailId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPan_no() {
        return pan_no;
    }

    public void setPan_no(String pan_no) {
        this.pan_no = pan_no;
    }

    public static String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        Customer.email_id = email_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

//    @Override
    public boolean equals(Customer c){
        return !getEmail_id().equals(Customer.email_id);
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Customer c_1 = new Customer("a","1","abc",100);
        Customer c_2 = new Customer("b","2","abc",50);
        System.out.println(c_2.equals(Customer.getEmail_id()));
    }
}
