package com.dsa;

public class Practise {
    public static void main(String[] args) {
        int n = 1;
        print(n);
    }
    static void print(int n) {
        System.out.println(n);
        if (n == 5) {
            return;
        }
        print(n+1);
    }
}
