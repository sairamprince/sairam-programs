package loops_examples;

public class wap_sumodall_evenno_1to15 {
	public static void main(String args[])
	{
		int i,sum = 0;
		for(i=1;i<=15;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			sum = sum+i;
		}
		System.out.println("sum of all even numbers from 1 to 15 is =  "+sum);
		
	}

}
