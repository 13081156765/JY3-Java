package com.ztnctc.www;

public class No42 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int[] nums1 = nums;
		for(int i = 0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		for(int j = 0;j<nums.length;j++) {
			System.out.println(nums1[j]);
		}
	}
}
