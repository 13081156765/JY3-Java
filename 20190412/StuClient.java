package com.baidu.www;

import java.util.Scanner;

public class StuClient {
	
	//��ʼ���û���������
	static String userName = "admin";
	static String passWord = "admin";
	
	//����Scanner��
	Scanner sca = new Scanner(System.in);
	public static void main(String[] args) {
		 StuClient stuClient = new StuClient();
		 stuClient.welcome();
	}
	
	//��ӭ����
	public void welcome(){
		System.out.println("********************��ӭ����ѧ������ϵͳ********************");
		System.out.println("*  1.��¼			2.�˳�    *");
		System.out.println("*******************************************************");
		//�����û������1��2
		System.out.println("���������ѡ�");
		int nextInt = sca.nextInt();
		if(nextInt == 1) {
			System.out.println("��ӭ��¼��");
			System.out.println("�������û�����");
			String stuName = sca.next();
			System.out.println("���������룺");
			String passWord = sca.next();
			StuManSys stuManSys = new StuManSys(userName,passWord);
			boolean login = login(stuManSys);
			if(login == true) {
				System.out.println("�����"+stuName);
			}
			else {
				System.out.println("��½ʧ�ܡ�����");
				welcome();
			}
		}
	}
	
	//��¼����
	public boolean login(StuManSys stuManSys) {
		System.out.println("��ӭ��¼��");
		//�жϴ�����û����������Ƿ�һ��
		if(userName.equals(stuManSys.userName) && passWord.equals(stuManSys.passWord)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//�˳�����
	public void exitSys() {
		System.exit(0);
	}
}
