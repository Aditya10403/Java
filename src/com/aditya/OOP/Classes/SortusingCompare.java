package com.aditya.OOP.Classes;

import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
    String name;
    Student(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public int compareTo(Student other){
        return this.name.compareTo(other.name);
    }
}
public class SortusingCompare {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[3];
        System.out.println("Enter names of students ->");

        for(int i = 0; i < 3 ; i++){
            String s = in.nextLine();
            students[i] = new Student(s);
        }
        Arrays.sort(students);
        for (Student student: students) {
            System.out.println(student.getName());
        }
    }
}
