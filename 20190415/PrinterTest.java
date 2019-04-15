package com.ztnctc.user;

public class PrinterTest {
	public static void main(String[] args) {
		Printer p1 = new ColorPrinter();
		p1.print();
		Printer p2 = new BlaAndWhiPrinter();
		p2.print();
	}
}
