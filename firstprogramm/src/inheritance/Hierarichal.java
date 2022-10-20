package inheritance;

class parent
{
	int x;
	void display()
	{
		System.out.println(x);
	}
}

class child1 extends parent
{
	int y;
	void print1()
	{
		System.out.println(y);
	}
}

class child2 extends parent
{
	int z;
	void print2()
	{
		System.out.println(z);
	}
}


public class Hierarichal {
	public static void main(String[] args)
	{
		child1 ch1=new child1();
		ch1.x=55;
		ch1.y=60;
		ch1.display();
		ch1.print1();
		
		child2 ch2=new child2();
		ch2.x=11;
		ch2.z=33;
		ch2.display();
		ch2.print2();
		
		
	}

}
