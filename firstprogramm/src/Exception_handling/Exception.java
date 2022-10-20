package Exception_handling;

public class Exception {
	public static void main(String[] args) {
		System.out.println("program is started");
		System.out.println("program is in progress");
		int a=10;
		int res=0;
		try
		{
			//System.out.println(a/0);//throw arithmetic exception
			res=a/2;
			
		}
		catch(ArithmeticException s)
		{
			System.out.println("entered into the catch block");
		}
		System.out.println(res);
		 
		
		String s=null; 
		try
		{
			System.out.println(	s.length());//throw nullpointerexception
		}
		catch(NullPointerException m)
		{
			System.out.println("entered into catch block1");
		}
		
		String n="abc";
		//int i=Integer.parseInt(n);//numberformatexception
		
		int arr[]=new int[5];
		//arr[10]=300;//arrayindexoutofbounds 
		
		System.out.println("program is completed");
		System.out.println("program is exited");
		}
}
