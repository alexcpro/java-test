//count of frequency of charqacter

public class frequency
{
	public static void main(String arg[])
	{
		String str ="The website is awesome";
		char ch ='e';
		int frequency=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				++frequency;
			}
		}	
		System.out.println("Frequency of "+ ch + "=" +frequency);
	}
}