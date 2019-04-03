import java.util.*;
public class ScoreDemo
{
	public static void main(String[] args)
	{
		String src = " ";
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入你的分数:");
		int score = scanner.nextInt();
		if(score > 100 || score < 0)
		{
			src = "super man";
		}
		else if(score >= 90 && score <= 100)
		{
			src = "优秀";
		}
		else if(score >= 80 && score < 90)
		{
			src = "良好";
		}
		else if(score < 80);
		{
			src = "不及格";
		}
		System.out.print("当前的结果为"+src);
	}
}