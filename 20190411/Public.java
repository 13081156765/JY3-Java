package com.ztnctc.www;
//  ִ�����ȼ�����̬����� > main���� > �������� > ���췽��
public class Public {
	//  main����
	public static void main(String[] args) {
		new B();
	}
}
	class A{
	    
		//  ��̬����
		static {
			System.out.println("1");
		}
		//  ��������(��ͨ����)
		{
			System.out.println("2");
		}
		//  ���췽��
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
