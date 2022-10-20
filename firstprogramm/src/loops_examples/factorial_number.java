package loops_examples;

public class factorial_number {
	public static void main(String args[])
	{
		int s,fact = 1;
		for(s=1;s<=7;s++) 
		{
			fact = fact*s;
		}
		System.out.println("factorial value of 7  is = "+fact);
	}
}
