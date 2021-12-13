package com.dsa;

import java.util.stream.IntStream;

public class ProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        System.out.print(calcualateSumAndProduct(234));
    }
    static int calcualateSumAndProduct(int num){
        int sum = 0;
        int product = 1;
        while (num > 0){
            sum += num % 10;
            product *= num % 10;
            num /= 10;
        }
        return product - sum;
    }
}
