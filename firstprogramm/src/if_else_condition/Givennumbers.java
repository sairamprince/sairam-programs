package if_else_condition;

public class Givennumbers {
	public static void main(String args[])
	{
		int a = 10;
		int b = 10;
		if(a==b)
		{
			System.out.println("given numbers are equal");
		}
		else
		{
			System.out.println("given numbers are not equal");
		}
		
		System.out.println("");
		
		int c = -100;
		if(c>=0)
		{
			System.out.println("given number is positive");
		}
		else
		{
			System.out.println("given number is negative");
		}
		
		System.out.println("");
		
		int p = 13;
		if(p>=18)
		{
			System.out.println("pooja is eligible for vote");
		}
		else
		{
			System.out.println("pooja is not eligible for vote");
		}
		System.out.println("");
		
		int d = 22;
		int v = 4;
		
		if(d%v==0)
		{
			System.out.println("22 is divisible by 4");
		}
		else
		{
			System.out.println("22 is not divisible by 4");
		}
		System.out.println("");
		int e = 32;
		if(e%2==0) 
		{
			System.out.println("32 is even number");
		}
		else
		{
			System.out.println("32 is not even number");
		}
		System.out.println("");
		int z = 10;
		int y = 27;
		int x = 6;
		if(z>y)
		{
			System.out.println("z is the greatet number");
		}
		else if(y>x)
		{
			System.out.println("y is the greatest number");
		}
		else if(z>x)
		{
			System.out.println("y is the greatest number");
		}
		System.out.println("");
		
		int num = 10;
		if(num%2==0 && num%4==0) 
		{
			System.out.println("10 is divisible by 2 and 4");
		}
		else if(num%2==0)
		{
			System.out.println("10 is divisible by 2 not by 4 ");
		}
		else if(num%4==0)
		{
			System.out.println("10 is not divisible by 4 not by 2");
		}
		else
		{
			System.out.println("10 is divisible by either 2 or 4");
		}
		
	}

}
