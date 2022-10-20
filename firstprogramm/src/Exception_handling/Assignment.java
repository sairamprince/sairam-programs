package Exception_handling;

public class Assignment {
	public static void main(String[] args)
	{
		System.out.println("program is started");
		System.out.println("program is in progress");
		int x=50;
		String a=null;
	
		try
		{
			System.out.println(x/0);
		}
		catch(ArithmeticException n)
		{
			System.out.println("program entered into catch block");
		}
		catch(NullPointerException y) 
		{
			System.out.println(a.length());
			System.out.println("program entered into catcg block");
		}
		String m="123";
		int i=Integer.parseInt(m);
		try
		{
			System.out.println(m);
		}
		catch(NumberFormatException z)
		{
			System.out.println("program entered into catch block");
		}
		
		
	}
}
