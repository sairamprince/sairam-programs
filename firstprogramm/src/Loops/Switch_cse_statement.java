package Loops;

import java.util.Scanner;

public class Switch_cse_statement {
	public static void main(String[]args)
	{
		//WAP to take any number and print corresponding day by referring below table.class SwitchDay
		int daynumber=5;
		switch(daynumber)
		{
		case 1: System.out.println("Day name = monday");
		break;
		case 2: System.out.println("Day name = tuesday");
		break;
		case 3: System.out.println("Day name = wednesday");
		break;
		case 4: System.out.println("Day name = thursday");
		break;
		case 5: System.out.println("Day name = friday");
		break;
		case 6: System.out.println("Day name = saturday");
		break;
		case 7: System.out.println("Day name = sunday");
		break;
		default : System.out.println("the given daynumber is invalid");
		break;
		}
		
	}

}
