import java.util.*;
public class ScoreDemo
{
	public static void main(String[] args)
	{
		String src = " ";
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������ķ���:");
		int score = scanner.nextInt();
		if(score > 100 || score < 0)
		{
			src = "super man";
		}
		else if(score >= 90 && score <= 100)
		{
			src = "����";
		}
		else if(score >= 80 && score < 90)
		{
			src = "����";
		}
		else if(score < 80);
		{
			src = "������";
		}
		System.out.print("��ǰ�Ľ��Ϊ"+src);
	}
}