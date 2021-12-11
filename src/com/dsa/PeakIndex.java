package com.dsa;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while (start < end) {
            int mid  =( start + end ) / 2;
            if (arr[mid] > arr[mid + 1])end = mid;
            else start = mid+1;
        }
        return start;
    }
}