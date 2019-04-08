package com.ztnctc.www;

import java.awt.Point;

public class Circle {
	int x;
	int y;
	public Point(int x,int y);{
		this.x = x;
		this.y = y;
	}
	int r;
	public double roundness() {
		double area = 3.14*(r*r);
		return area;
	}
}
