package com.dsa;

import java.util.Scanner;
//Write a program to print factorial of a number, also take input.
public class NumberFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(calculateFactorial(in.nextInt()));
    }

    static int calculateFactorial(int num) {
        return num == 0 || num == 1 ? 1  : num * calculateFactorial(num - 1);
    }

}
