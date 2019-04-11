package com.ztnctc.www;

import java.util.Arrays;

public class No43 {
	public static void main(String[] args) {
		int[] nums = {1,6,2,3,9,4,5,7,8};
		nums = chooseSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	public static int[] chooseSort(int[] nums) {
		for(int i = 0;i<nums.length-1;i++) {
			for(int j = i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
}
