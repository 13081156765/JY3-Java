package com.ztnctc.www;

public class StudentTest {
	public static void main(String[] args) {
		Student[] stus = new Student[4];
		stus[0] = new Student("jia","2016",30);
		stus[1] = new Student("yi","2017",90);
		stus[2] = new Student("bing","2018",60);
		stus[3] = new Student("ding","2019",0);
		StudentSort.ranking(stus);
		for(Student stu:stus) {
			stu.rank();
		}
	}
}
