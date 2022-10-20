package loops_examples;

public class Palindrome_or_not {
	public static void man(String args[])
	{
		int num=112211,rev1=0,rem,temp=num;
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
