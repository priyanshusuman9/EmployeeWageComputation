package com.bridgelabz;

public class DailyWage {
    public static void main(String[] args) {
        System.out.println("Welcome To the Employee Wage Computation");

        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage = 0;
        int employeeCheck = (int) Math.floor(Math.random()*10)%2;
        if (employeeCheck==1){
            dailyWage = wagePerHour*fullDayHour;
            System.out.println("dailyWage is " + dailyWage);
        }
        else {
            System.out.println("Employee is Absent Daily wage is " + dailyWage);
        }
    }
}
