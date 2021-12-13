package com.dsa;

import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input.
public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(checkEvenOdd(in.nextInt()));
    }
    static boolean checkEvenOdd(int num){
        return num % 2 == 0 ? true : false;
    }
}
