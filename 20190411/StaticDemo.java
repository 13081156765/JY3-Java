package com.ztnctc.www;
// static > new
public class StaticDemo {
	static int a = 15;
	//������(ֻ��һЩ����Ϣ�Լ�static���εģ� ����һЩ����)
	public static void main(String[] args) {
//		System.out.print(a); 
		new StaticTest();
		System.out.println(StaticTest.name);
	}
}