package com.ztnctc.www;

public class PersonCreate {
	public static void main(String[] args) {
		Person person = new Person("zhangsan",33,1.73);
		person.sayHello();
		Person person2 = new Person("lishi",44,1.74);
		person2.sayHello();
	}
}
