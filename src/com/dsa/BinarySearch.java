package com.dsa;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int lower_bound = 0;
        int upper_bound = nums.length - 1;
        System.out.println(findElement(nums,target,lower_bound,upper_bound));
    }
    static int findElement(int[] nums,int target,int lower_bound, int upper_bound) {
        int mid=0;
        if (upper_bound >= lower_bound){
            mid = (lower_bound + upper_bound) / 2;
            if (nums[mid] == target) return mid ;
            else if (nums[mid] < target) return findElement(nums,target,mid+1 ,upper_bound);
            else return  findElement(nums,target,lower_bound,mid-1);
        }
        return -1;
    };
}
