package com.ztnctc.www;

public class Perso {
	String name;
	int age;
	double height;
	public Perso() {
		
	}
	public Perso(String name,int age,double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public void sayHello() {
		System.out.println("hello,my name is "+name+" "+age+" "+height);
	}
}
