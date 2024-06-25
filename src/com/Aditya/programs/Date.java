package com.Aditya.programs;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
        String dateStr = "2024-06-23";
        LocalDate date = LocalDate.parse(dateStr);
        System.out.println("Converted LocalDate: " + date.plusDays(100));
    }
}
