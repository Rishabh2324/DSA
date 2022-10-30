package com.dsa;

import java.util.Scanner;

public class CalculateSalary {

    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        int basicSalary = sys.nextInt();
        String grade = sys.next();
        System.out.println(totalSalary(basicSalary,grade));
    }

    static int totalSalary(int basicSalary, String grade){
        return (int) Math.round(basicSalary + hra(basicSalary) + da(basicSalary) + allowance(grade) - pf(basicSalary));
    };
    static double hra(int basicSalary){
        return (basicSalary * 0.2);
    }
    static  double da(int basicSalary){
        return  (basicSalary * 0.5);
    }
    static int allowance(String grade){
        switch(grade) {
            case "A":
                return 1700;
            case "B":
                return 1500;
            default:
                return 1300;
        }
    }
    static double pf(int basicSalary){
        return (basicSalary * 0.11);
    }

}
