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
		System.out.println("�ʼǱ���ɫΪ��"+color);
		System.out.println("CPU�ͺ��ǣ�"+cpuType);
	}
}
