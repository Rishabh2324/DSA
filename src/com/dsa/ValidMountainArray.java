package com.dsa;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(validMountainArray(arr));
    }
    static boolean validMountainArray(int[] arr) {
        int peekIndex = 0;
        if (arr.length == 1) return false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) return false;
            if (arr[i] < arr[i+1] && i <arr.length-1)continue;
            if (arr[i] > arr[i+1] && i < arr.length -1 && i > 0) {
                peekIndex = i;
                break;
            }else return false;
        }
        for (int i = peekIndex; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) return false;
            if (arr[i] < arr[i+1]) return false;
        }
        return true;
    }
}
