package Exception_handling;
//unchecked exception
public class Finally {
	public static void main(String[] args)
	{
		System.out.println("program started");
		
		int i=100;
		try
		{
			System.out.println(i/0);
		}
		catch(ArithmeticException s)
		{
			System.out.println("program entered into catch");
		}
		finally
		{
			System.out.println("entered into finally block");
		}
		System.out.println("program exited");
		
	}

}
