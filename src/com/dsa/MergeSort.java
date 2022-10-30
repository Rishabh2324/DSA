package com.dsa;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,9,1,3,5,0,-1,-2,11};
       mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void merge(int[] s1, int[] s2, int[] d){
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < s1.length  && j < s2.length){
            if (s1[i] <=  s2[j]) {
                d[k] = s1[i];
                i++;
            }else {
                d[k] = s2[j];
                j++;
            }
            k++;
        }


        if (i < s1.length) {
                while (i < s1.length){
                    d[k] = s1[i];
                    i++;
                    k++;
                }
            }
            if (j < s2.length) {
                while (j < s2.length){
                    d[k] = s2[j];
                    j++;
                    k++;
                }
            }
    }
    
    public static void mergeSort(int[] arr){
        if (arr.length <= 1){
            return;
        }
        int[] b = new int[arr.length/ 2];
        int[] c = new int[arr.length - b.length];
        for (int i = 0; i < arr.length/2; i++) {
            b[i] = arr[i];
        }
        for (int i = arr.length/ 2; i < arr.length; i++) {
            c[i - arr.length/2] = arr[i];
        }

        mergeSort(b);
        mergeSort(c);
        merge(b,c,arr);
    }

}
