package com.ztnctc.www;

public class Shui {
	public static void main(String[] args) {
	for(int i=100;i<=999;i++) {
		int hunNum = i/100;
		int tenNum = i/10%10;
		int num = i%10;
		double a = Math.pow(hunNum, 3)+Math.pow(tenNum, 3)+Math.pow(num, 3);
		if(i==a) {
			System.out.println(i);
		}
		
	}
}
}
