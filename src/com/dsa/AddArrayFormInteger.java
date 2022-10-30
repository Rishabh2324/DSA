package com.dsa;

import java.util.LinkedList;
import java.util.List;

public class AddArrayFormInteger {
    public static void main(String[] args) {
        int[] nums = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(nums,k));
    }
    static List<Integer> addToArrayForm(int[] nums, int k) {
        LinkedList<Integer> res = new LinkedList<>();
        int len = nums.length-1;
        while (len >=0 || k != 0){
            if (len >=0) k+=nums[len--];
            res.addFirst(k%10);
            k/=10;
        }
    return res;
    }
}
