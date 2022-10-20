package Loops;

public class Pallindrome_or_not 
{
	public static void main(String args[])
	{
		
		int num=120,rev1=0,rem,temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev1=(rev1*10)+rem;	
		}
		
		System.out.println("reverse of a number is:"+rev1);
		
		if(temp==rev1)
		{
			System.out.println("given number is palindrome number");
		}
		else
		{
			System.out.println("given number is not palindrome");
		}
	}
}
