package com.ztnctc.www;

public class Point {
	
		int x;
		int y;
	public Point() {
		
	}
	public Point(int x0,int y0) {
		 x= x0;
		 y= y0;
	}
	
	public void movePoint(int dx,int dy) {
		x += dx;
		y += dy;
	}
	public static void main(String[] args) {
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		p1.movePoint(5, 5);
		System.out.println(p1.x+","+p1.y);
		p2.movePoint(5, 5);
		System.out.println(p2.x+","+p2.y);
	}
	
}
