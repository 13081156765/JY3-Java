package com.ztnctc.user;

public class Rectangle extends Shape{
	int height;
	int weigth;
	public Rectangle(int height,int weigth) {
		this.height = height;
		this.weigth = weigth;
	}
	public void area() {
		System.out.println("矩形的面积为："+height*weigth);
	}
	public boolean contains(Point p) {
		boolean result = (p.y >= 0 && p.y <= height && p.x >= 0 && p.x <= weigth);
		return result;
	}
}
