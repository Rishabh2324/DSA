package com.dsa;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,14,18};
        System.out.println(binarySearch(arr,0,arr.length,11));
    }

    public static int binarySearch(int[] arr, int start_index, int end_index ,int x) {
        if (arr.length == 0 || start_index > end_index) {
             return -1;
        } else {
            int mid = (start_index + end_index) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            else if (arr[mid] > x) {
                return binarySearch(arr , start_index , mid -1 , x);
            } else {
                return binarySearch(arr,mid + 1 , end_index ,x);
            }
        }
    }
}
