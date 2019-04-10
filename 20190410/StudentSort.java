package com.ztnctc.www;

public class StudentSort {
	public static void ranking(Student[] stus) {
		Student stu;
		for(int i=0;i<stus.length-1;i++) {
			for(int j=i+1;j<stus.length;j++) {
				if(stus[i].grade<stus[j].grade) {
					int temp = stus[i].grade;
					stus[i].grade = stus[j].grade;
					stus[j].grade = temp;
				}
			}
		}
	}
}
