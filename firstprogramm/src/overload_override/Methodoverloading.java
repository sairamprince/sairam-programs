package overload_override;

public class Methodoverloading {
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(int a, double b)
	{
		System.out.println(a+b);
	}
	void add(double a, double b)
	{
		System.out.println(a+b);
	}
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args)
	{
		Methodoverloading mol=new Methodoverloading();
		mol.add(10,20);
		mol.add(20,30.55);
		mol.add(15.50, 15.50);
		mol.add(20,20,40);
		
				
	}

}
