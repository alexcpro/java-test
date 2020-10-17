import java.util.Scanner;

public class  CheckPalin
{
	public static void main(String arg[])
	{
		String rev="";
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		int length = str.length();
		for(int i=length-1;i>=0;i--)
			rev =rev +str.charAt(i);
		if(str.equals(rev))
			System.out.println("is a palindrome");
		else
			System.out.println("is not a palindrome");
	}
}