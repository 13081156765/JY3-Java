import java.util.*;
public class ScannerDemo
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个数字:");
		int num = scanner.nextInt();
		System.out.println("输入一个值:"+num*num);
		
		double bird = 0.00045;
		double lightYear = 94605000000000.0*4.2;
		System.out.println(lightYear/bird);
		
		double v = 2*9.8*384;
		System.out.print(Math.sqrt(v));
	}
}