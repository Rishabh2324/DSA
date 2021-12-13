package com.dsa;

import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int[] arr =  {1,3,2,1};
        System.out.println(Arrays.toString(concatArray(arr)));
    }
    static int[] concatArray(int[] arr) {
        int sumVar = 0;
        int[] ans = new int[arr.length];
        for (int i = 0 ; i < arr.length; i++) {
            sumVar = sumVar + arr[i];
            ans[i] = sumVar;
        }
        return ans;
    }
}