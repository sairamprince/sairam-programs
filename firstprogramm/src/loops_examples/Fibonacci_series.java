package loops_examples;

public class Fibonacci_series {
	public static void main(String args[ ]) 
	{    
		int s=1,s1=2,s2;
		System.out.println(s+"");
		System.out.println(s1+"");
		for(int i=1;i<=10;i++)
		{
		s2 = s+s1;
		System.out.println(s2+"");
		s=s1;
		s1=s2;
		}
		
	}
		

}
