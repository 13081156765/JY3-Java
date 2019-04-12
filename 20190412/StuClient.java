package com.baidu.www;

import java.util.Scanner;

public class StuClient {
	
	//初始化用户名和密码
	static String userName = "admin";
	static String passWord = "admin";
	
	//创建Scanner类
	Scanner sca = new Scanner(System.in);
	public static void main(String[] args) {
		 StuClient stuClient = new StuClient();
		 stuClient.welcome();
	}
	
	//欢迎界面
	public void welcome(){
		System.out.println("********************欢迎来到学生管理系统********************");
		System.out.println("*  1.登录			2.退出    *");
		System.out.println("*******************************************************");
		//接收用户输入的1和2
		System.out.println("请输入你的选项：");
		int nextInt = sca.nextInt();
		if(nextInt == 1) {
			System.out.println("欢迎登录！");
			System.out.println("请输入用户名：");
			String stuName = sca.next();
			System.out.println("请输入密码：");
			String passWord = sca.next();
			StuManSys stuManSys = new StuManSys(userName,passWord);
			boolean login = login(stuManSys);
			if(login == true) {
				System.out.println("中午好"+stuName);
			}
			else {
				System.out.println("登陆失败。。。");
				welcome();
			}
		}
	}
	
	//登录方法
	public boolean login(StuManSys stuManSys) {
		System.out.println("欢迎登录！");
		//判断传输的用户名和密码是否一致
		if(userName.equals(stuManSys.userName) && passWord.equals(stuManSys.passWord)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//退出程序
	public void exitSys() {
		System.exit(0);
	}
}
