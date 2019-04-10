package com.ztnctc.www;

public class NoteBookComputer {
	char color;
	int cpuType;
	public NoteBookComputer() {
		
	}
	public NoteBookComputer(char color,int cpuType) {
		this.color = color;
		this.cpuType = cpuType;
	}
	public void messAge() {
		System.out.println("笔记本颜色为："+color);
		System.out.println("CPU型号是："+cpuType);
	}
}
