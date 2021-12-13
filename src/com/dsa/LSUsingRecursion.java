package com.dsa;

public class LSUsingRecursion {
    public static void main(String[] args) {
        int[] nums = {3,2,1,18,9};
        int target = 10;
        System.out.println(findElement(target, nums , 0));
    }
    static int findElement(int target, int[] nums , int i){
        if (i == nums.length-1) return -1;
        else if (nums[i] == target) return i;
        return findElement(target,nums,i+1);
    }
}
