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
		System.out.print("���Ϊ��"+width*length);
	}
	public void getPer() {
		System.out.print("�ܳ�Ϊ��"+(2*width+2*length));
	}
	public void showAll() {
		System.out.print("����"+length);
		System.out.print("��"+width);
	}
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10,20);
		rec.getArea();
		rec.getPer();
		rec.showAll();
	}
}
