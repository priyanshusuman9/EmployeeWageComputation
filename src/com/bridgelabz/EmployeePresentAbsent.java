package com.bridgelabz;

public class EmployeePresentAbsent {

    public static void main(String[] args) {
        System.out.println("Welcome To the Employee Wage Computation");

        int employeeCheck = (int) Math.floor(Math.random()*10)%2;
        if (employeeCheck==1){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }

    }
}
