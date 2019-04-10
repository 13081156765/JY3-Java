package com.ztnctc.www;

public class Student {
	private String name;
	private String studentNum;
	private int grade;
	
	public Student() {
		
	}
	public Student(String name,String studentNum,int grade) {
		this.name = name;
		this.studentNum = studentNum;
		this.grade = grade;
	}
	
	public void rank() {
		System.out.println(name+" "+studentNum+" "+grade);
	}
}
