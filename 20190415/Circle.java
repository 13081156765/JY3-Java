package com.ztnctc.user;

public class Circle extends Shape{
	int r;
	public Circle(int r) {
		this.r = r;
	}
	public void area() {
		System.out.println("圆的面积为："+Math.PI*r*r);
	}
	public boolean contains(Point p) {
		boolean result = Math.pow((p.x-p1.x),2) + Math.pow((p.y-p1.y),2) <= r*r;
		return result;
	}
}
