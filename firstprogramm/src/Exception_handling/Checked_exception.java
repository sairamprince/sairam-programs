package Exception_handling;

public class Checked_exception {
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("program is started");
		System.out.println("program is in progress");
		/*try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException a)
		{
			System.out.println("program entered inti catch");
		}*/
		Thread.sleep(5000);
		
		System.out.println("program is completed");
		System.out.println("program is exited");
		
		
	}

}
