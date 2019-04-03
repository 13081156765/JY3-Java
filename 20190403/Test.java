import java.util.*;
public class Test
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		char userName = 'a';
		char passWord = 'b';
		String inputUser = scanner.next();
		System.out.print("请输入您的用户名:");
		String inputPsw = scanner.next();
		System.out.print("请输入密码:");
		char c1 = inputUser.charAt(0);
		char c2 = inputPsw.charAt(0);
		if(userName = c1 && passWord = c2);
		{
			System.out.print("登录...")；
		}
		
	}
}
