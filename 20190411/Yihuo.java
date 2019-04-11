package com.ztnctc.www;

public class Yihuo {
	public static void main(String[] args) {
		int a = 314354;
		int b = 68455513;
		a = a^b;
		b = a^b;
		a = a^b;
//		a = a+b;
//		b = a-b;
//		a = a-b;
		System.out.println(a);
		System.out.println(b);
	}
}
