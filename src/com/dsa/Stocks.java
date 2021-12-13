package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Stocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(getProfit(prices));
    }
    static int getProfit(int[] prices) {
        int[] sortedPrice = prices.clone();
        int[] profits = new int[prices.length];
        Arrays.sort(sortedPrice);
        int minPrice = sortedPrice[0];
        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length-1 && prices[i] == minPrice) return 0;
            else {
                if (prices[i] > minPrice) profits[i] = prices[i] - minPrice;
            }
        }
        return profits[-1];
    }
}
