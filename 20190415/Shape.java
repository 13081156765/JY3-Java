package com.ztnctc.user;
import java.util.*;
public class Shape {
	Point p1;
	public Shape() {
		
	}
	public Shape(Point p1) {
		this.p1 = p1;
	}
	public void area() {
		System.out.println("Ãæ»ýÊÇ£º");
	}
	public boolean contains(Point p) {
		boolean result = Math.pow((p.x-p1.x), 2)+Math.pow((p.y-p1.y), 2) <= 50;
		return result;
	} 
}
class Point{
	int x;
	int y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
}



