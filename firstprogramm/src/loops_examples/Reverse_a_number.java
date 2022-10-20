package loops_examples;

public class Reverse_a_number {

	public static void main(String[] args) {
		int number=1806,rev=0,rem;
		while(number>0)
		{
			rem=number%10;
			number=number/10;
			rev=rev*10+rem;
			
		}
		System.out.println("reverse of a number is : "+rev);
		
	}

}
