package loops_examples;

public class waptoprint_1to30_divisibleby5 {
	public static void main(String args[])
	{
		int count=0,num = 5;
		for(int i=1;i<=30;i++)
		{
			if(i%num==0)
			{
				count++; //count+1;
			}
		}
		System.out.println("finial count is = "+count);
		
	}

}
