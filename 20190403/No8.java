public class No8
{
	public static void main(String [] args)
	{
		String str = "692116851128";
		System.out.println(str.length());
		int oddNum = 0;
		for(int i=0;i<str.length();i+=2)
		{
			char c = str.charAt(i);
			oddNum = oddNum + c - 48;
		}
		System.out.println(oddNum);
		int evenNum = 0;		
		for(int i=1;i<str.length();i+=2)	
		{
			char c = str.charAt(i);
			evenNum = evenNum + c - 48;
		}
		System.out.println(evenNum);
		System.out.println(oddNum+evenNum*3);
		System.out.println(110%10);
		System.out.println(10-0);
		System.out.println(10%10);
	}
}