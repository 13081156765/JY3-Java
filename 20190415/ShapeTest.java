package com.ztnctc.user;

public class ShapeTest extends Shape{
	public static void main(String[] args) {
//		Point point = new Point(0,0);
		Circle cir = new Circle(5);
		cir.p1=new Point(0,0);
		cir.area();
		Point circlep = new Point(6,2);
		System.out.println(cir.contains(circlep) == true ? "在圈内":"在圈外");
		Rectangle rec = new Rectangle(10,10);
		rec.p1 = new Point(0,0);
		rec.area();
		Point recp = new Point(6,2);
		System.out.println(rec.contains(recp) == true ? "在圈内":"在圈外");
	}
}
