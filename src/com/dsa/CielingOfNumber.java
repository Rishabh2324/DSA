package com.dsa;

public class CielingOfNumber {
    public static void main(String[] args) {
        int[] nums= {1,2,4,6,8,12,19};
        int target = 0;
        System.out.println(cielingNumber(nums,0,nums.length-1,target));
    }
    static int cielingNumber(int[] nums , int start, int end, int target) {
        int cieling=-1;
        if (target > nums[nums.length -1]) return -1;
        if (start < end) {
            int mid = (start + end)/2;
            if  (target > nums[mid] ) {
                start = mid+1;
                return cielingNumber(nums,start,end,target);
            } else  {
                end = mid;
                return cielingNumber(nums,start,end,target);
            }
        }else {
            cieling = nums[start];
        }
        return cieling;
    }
}
