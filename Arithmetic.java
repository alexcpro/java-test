class Arithmetic{
	public static void main(String arg[])
	{
		add num1=new add(10,5);
		num1.sum();
		sub num2=new sub(10,5);
		num2.sum();
		div num3=new div(10,5);
		num3.sum();
		multi num4=new multi(10,5);
		num4.sum();	
	}
}
class add{
	int x,y;	
	add(int xx,int yy)
	{
		x=xx;
		y=yy;
	}
	void sum(){
		System.out.println(x+y);
	}
}
class sub{
	int x,y;
	sub(int xx,int yy)
	{
		x=xx;
		y=yy;
	}
	void sum(){
		System.out.println(x/y);
	}
}
class div{
	int x,y;
	div(int xx,int yy)
	{
		x=xx;
		y=yy;
	}
	void sum(){
		System.out.println(x-y);
	}
}
class multi{
	int x,y;
	multi(int xx,int yy)
	{
		x=xx;
		y=yy;
	}
	void sum(){
		System.out.println(x*y);
	}
}