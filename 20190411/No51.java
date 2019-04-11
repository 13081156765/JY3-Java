package com.ztnctc.www;
public class No51 {
	public static void main(String []args){
		int a = 5;
		System.out.println(factorial(a));
	}
		public static int factorial(int nums) {
			int fac = 1;
			for(int i = 1;i<=nums;i++){
				fac *= i; 
			}
			return fac;
		}
}
