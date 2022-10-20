package This;

public class This_keyword {
	
	int a,b;
	void getvalues(int a, int b) {
		this.a=a;
		this.b=b;
		
	}
	
	void printvalues()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args)
	{
		This_keyword th=new This_keyword();
		th.getvalues(20,50);
		th.printvalues();
	}

}
