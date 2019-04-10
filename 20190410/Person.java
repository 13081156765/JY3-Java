package com.ztnctc.www;

public class Person {
	String name;
	int age;
	double height;
	public Person() {
		
	}
	public Person(String name,int age,double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public void sayHello() {
		System.out.println("Hello,my name is "+name+" "+age+" "+height);
	}
}

