package com.ztnctc.www;

public class StudentSort {
	public static void ranking(Student[] stus) {
		Student student = new Student();
		for(int i=0;i<stus.length-1;i++) {
			for(int j=i+1;j<stus.length;j++) {
				if(stus[i].grade<stus[j].grade) {
					student = stus[i];
					stus[i] = stus[j];
					stus[j] = student;
				}
			}
		}
	}
}
