package com.epam.test;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        double result = salaryPerYear();
        System.out.println("Gross yearly salary: " +result);
    }

    public static double salaryPerYear(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type hours per week");
        double hoursWeek = scan.nextDouble();
        System.out.println("Type money per hour");
        double moneyHours = scan.nextDouble();
        System.out.println("Type vacation days");
        double vacationHours = scan.nextDouble() * 8;
        return ((moneyHours-vacationHours) * hoursWeek) * 52;
    }
}
