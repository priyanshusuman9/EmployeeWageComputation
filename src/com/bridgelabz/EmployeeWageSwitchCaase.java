package com.bridgelabz;

public class EmployeeWageSwitchCaase {
    public static void main(String[] args) {
        System.out.println("Welcome To the Employee Wage Computation");

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeWage = 4;
        int dailyWage = 0;
        int employeeCheck = (int)(Math.random() * ((2 + 0) + 1));

        switch (employeeCheck){
            case 1:
                dailyWage= fullDayHour*wagePerHour;
                System.out.println("Employee Full Time Wage is " +" "+ dailyWage);
                break;
            case 2:
                dailyWage=partTimeWage*wagePerHour;
                System.out.println("Employee Part Time Wage is " + " "+ dailyWage);
                break;

            default:
                System.out.println( "Employee is Absent Daily Wage is " + " " + dailyWage);
        }
    }
}
