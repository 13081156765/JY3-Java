import java.util.*;
public class No6
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("����������:");
			int i = scanner.nextInt();
			if(i==-1){
				break;
			}
			System.out.print("���Ϊ:"+i);
		}
	}
}