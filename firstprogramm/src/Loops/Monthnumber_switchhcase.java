package Loops;

import java.util.Scanner;

public class Monthnumber_switchhcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the monthnumber");
		int monthnumber=sc.nextInt();
		//int monthnumber=11;
		switch(monthnumber)
		{
		case 1: System.out.println("Monthname = January");
		break;
		case 2: System.out.println("Monthname = February");
		break;
		case 3: System.out.println("Monthname = March");
		break;
		case 4: System.out.println("Monthname = April");
		break;
		case 5: System.out.println("Monthname = May");
		break;
		case 6: System.out.println("Monthname = June");
		break;
		case 7: System.out.println("Monthname = July");
		break;
		case 8: System.out.println("Monthname = August");
		break;
		case 9: System.out.println("Monthname = September");
		break;
		case 10: System.out.println("Monthname = October");
		break;
		case 11: System.out.println("Monthname = November");
		break;
		case 12: System.out.println("Monthname = December");
		break;
		default : System.out.println("invalid monthnumber");
		
		}
		
	}

}
