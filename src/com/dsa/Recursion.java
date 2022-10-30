package com.dsa;

public class Recursion {
    public static void main(String[] args) {
        int si = 0;
        int [] input = {4,2,1};
        System.out.println(sum(input,si));
    }

    public static int sum(int input[], int si) {
        int arr_length = input.length;
        if (arr_length - 1 == si) {
            return input[si];
        }
        int finalSum = input[si] + sum(input,si  + 1);
        return finalSum;
    };
}
