package com.ztnctc.www;
// static > new
public class StaticDemo {
	static int a = 15;
	//方法区(只放一些类信息以及static修饰的， 还有一些常量)
	public static void main(String[] args) {
//		System.out.print(a); 
		new StaticTest();
		System.out.println(StaticTest.name);
	}
}