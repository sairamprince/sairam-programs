package loops_examples;

public class Prime_number_or_not {

	public static void main(String[] args) {
		
	int number = 22;
	boolean flag=true;
	for(int i=2;i<number;i++)
	{
		if(number%i==0)
		{
			flag = false;
			break;
		}
	}
	if(flag==true)
	{
		System.out.println(number+" is prime number");
	}
	else
	{
		System.out.println(number+" is not prime number");
	}
}
}

	
	
	
	

