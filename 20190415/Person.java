package com.ztnctc.user;

public class Person {
	public static void main(String[] args) {
		Person person = new Person();
		Train train = new Train();
		person.play(train);
	}
	public void play(Vehicle v) {
		v.trip();
	}
}
