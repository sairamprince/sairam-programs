package typesof_constructor;

public class Constructor_demo {
	int x;
	int y;
	
	Constructor_demo()//this is default constructor
	{
		x=40;
		y=10;
		
	}
	
	Constructor_demo(int a, int b)
	{
		x=a;
		y=b;
	}
	
	
	void display()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args)
	{
		Constructor_demo cm1=new Constructor_demo();//invokes default constructor 
		cm1.display();
		
		Constructor_demo cm2=new Constructor_demo(24,16);//invokes parameterized constructor
		cm2.display();
	}

}
