package com.dsa;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(7));
    }
    static boolean isPowerOfTwo(int n) {
        if(n < 0) return false;
        if(n == 0) return false;
        if(n == 1) return true;
        if (n%2 != 0) return false;
        else return isPowerOfTwo(n/2);
    }
}
