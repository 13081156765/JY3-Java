package com.baidu.www;

import java.util.Scanner;

public class StuTest {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int hasNext = scanner.nextInt();
		if(hasNext == 2) {
			System.exit(0);
		}
	}
}
   