package com.ztnctc.www;

public class Rectangle {
	int length;
	int width;
	public Rectangle() {
		
	}
	public Rectangle(int width,int length) {
		this.width = width;
		this.length = length;
	}
	public void getArea() {
		System.out.print("面积为："+width*length);
	}
	public void getPer() {
		System.out.print("周长为："+(2*width+2*length));
	}
	public void showAll() {
		System.out.print("长："+length);
		System.out.print("宽："+width);
	}
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10,20);
		rec.getArea();
		rec.getPer();
		rec.showAll();
	}
}
