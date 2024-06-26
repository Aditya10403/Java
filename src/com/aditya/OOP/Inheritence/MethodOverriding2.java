package com.aditya.OOP.Inheritence;


class Person{
    String gender;
    int age;
    Person(){
        this.age = 0;
        this.gender = "";
    }
    Person(String gender){
        this.gender = gender;
    }
    Person(String gender, int age){
        this.gender = gender;
        this.age = age;
    }
}
class Employee extends Person{
    float salary;
    Employee(){
        this.salary = 0.0f;
    }
    Employee(float salary,String gender){
        super(gender);
        this.salary = salary;
    }
}
class Manager extends Person{
    int noOfEmloyeesUnder;
    Manager(){
        this.noOfEmloyeesUnder = 0;
    }
    Manager(int noOfEmloyeesUnder,String gender){
        super(gender);
        this.noOfEmloyeesUnder = noOfEmloyeesUnder;
    }
}
public class MethodOverriding2 {
    public static void main(String[] args) {
        /* Zero Argument - Default Constructor ->
        Manager m = new Manager();
        System.out.println(m.noOfEmloyeesUnder);
        System.out.println(m.gender);
         */
        Manager m = new Manager(1,"Male");
        System.out.println(m.noOfEmloyeesUnder);
        System.out.println(m.gender);
    }
}
