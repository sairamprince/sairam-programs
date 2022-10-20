package loops_examples;

import java.util.Scanner;

public class Prime_number_or_not {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number to check it is prime numner or not");
	int number = sc.nextInt();
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
		System.out.println("the given number is prime number");
	}
	else
	{
		System.out.println("the given number is not prime number");
	}
}
}

	
	
	
	

