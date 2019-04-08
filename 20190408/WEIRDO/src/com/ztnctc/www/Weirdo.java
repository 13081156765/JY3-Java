package com.ztnctc.www;



public class Weirdo {
	String name;
	int page;
	double price;
	String writer;
	int ISBN;
	String type;
	String publisher;
	public void read() {
		System.out.println("正在看书...");
	}
	public void collect() {
		System.out.println("已收藏。。。");
	}
	public double sell(double price,int quantity) {
		double money = price*quantity;
		return money;
	}
}
