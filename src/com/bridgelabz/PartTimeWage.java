package com.bridgelabz;

import java.util.Random;

public class PartTimeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To the Employee Wage Computation");

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeWage = 4;
        int dailyWage = 0;
        int employeeCheck = (int)(Math.random() * ((2 + 0) + 1));

        if (employeeCheck==2) {
            dailyWage=fullDayHour*wagePerHour;
            System.out.println("Employee is Present Full Time wage is " + " " + dailyWage);
        } else if (employeeCheck==1){
            dailyWage=partTimeWage*wagePerHour;
            System.out.println("Employee is Present Half Time wage is " + " " + dailyWage);

        }
        else {
            System.out.println("Employee is Absent wage is " + " " + dailyWage);
        }

    }
}
