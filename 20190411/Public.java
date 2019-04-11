package com.ztnctc.www;
//  执行优先级：静态代码块 > main方法 > 构造代码块 > 构造方法
public class Public {
	//  main方法
	public static void main(String[] args) {
		new B();
	}
}
	class A{
	    
		//  静态语句块
		static {
			System.out.println("1");
		}
		//  构造代码块(普通语句块)
		{
			System.out.println("2");
		}
		//  构造方法
		public A() {
			System.out.println("3");
		}
	    
	}
	class B extends A{
		static {
			System.out.println("4");
		}
		public B() {
			System.out.println("5");
		}
		{
			System.out.println("6");
		}
	}
