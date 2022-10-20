package inheritance;

interface ABC
{
	int x=100;
    void m1();
}
interface XYZ
{
	int y=200;
	 void m2();
}





public class Multiple_inheritance implements ABC,XYZ
{
	public void m1()
	{
		System.out.println(x);
	}
	
	public void m2()
	{
		System.out.println(y);
		}
	public static void main(String[] args)
	{
		Multiple_inheritance mul=new Multiple_inheritance();
		mul.m1();
		mul.m2();
		
	}

}
