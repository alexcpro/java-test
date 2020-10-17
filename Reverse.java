class Reverse
{
	public static void main(String args[])
	{
		String a =  "sample";
		int len=a.length();
		System.out.println(a);
		char[] b= new char[len];
		for(int i=0;i<len;i++)
		{
			 b[len-1-i]=a.charAt(i);//only change comes here
       		}
        	for(int i=0;i<len;i++)
		{	
			 System.out.print(b[i]);
		}
		

	}
}
/*
when we store in reverse direction we start from the last element to store the first element of the array.
in qs, it was only given b[len-1] this part is not changing so always the last letter is overwritten every time the loop runs all other elements still empty(except the last element).

to store all elements in reverse order it should start at last and move towards the 0 indexes of the array.

by giving b[len-1-i] for i=0 b[len-1-i] will be b[len-1] //that is the last element .
when i =1 b[len-i-1] will be the second last element when I increment further element being stored is moving towards the 0 indexes as this Reverse works fine 

\\hope it is simple happy coding ♥
*/
