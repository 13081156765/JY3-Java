package com.ztnctc.www;

import java.util.Scanner;

public class No52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		if(year%4 == 0) {
			System.out.println("����������");
		}
		else {
			System.out.println("������ƽ��");
		} 
	}
}