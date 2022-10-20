package loops_examples;

public class Suare_of_the_number {
	public static void mian(String args[])
	{
		int num = 4,n=2,a=1,pow;
		for(int i=1;i<num;i++)
		{
			pow = a*num;
			a=pow;
			if(i==n)
			{
			System.out.println(num+"to the power of "+n+"is:"+pow);
			}
		
		}
	}

}
