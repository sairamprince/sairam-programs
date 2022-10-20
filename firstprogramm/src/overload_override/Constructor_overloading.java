package overload_override;

public class Constructor_overloading {
	
	Constructor_overloading(int x, int y)//1
	{
		System.out.println(x+y);
	}
	Constructor_overloading(int x, double y)//2
	{
		System.out.println(x+y);
	}
	Constructor_overloading(double x, int y)//3
	{
		System.out.println(x+y);
	}
	Constructor_overloading(int x, int y, int z)//4
	{
		System.out.println(x+y+z);
	}
	

	public static void main(String[] args) {
		Constructor_overloading col=new Constructor_overloading(15.55,10);//3
		

	}

}
