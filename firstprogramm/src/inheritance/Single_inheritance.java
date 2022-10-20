package inheritance;

class A // A is a parent class   
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}


class B extends A
{
	int b;
	void print()
	{
		System.out.println(b);//B is a child class
	}
}
	

class C extends B
{
int c;
void print1()
{
	System.out.println(c); //C  is the child of class B 
}
	

}


public class Single_inheritance {
	
	public static void main(String[] args)
	{
		A aaaa=new A(); // object of A
		aaaa.a=100;
		aaaa.display();
		
		B bobj=new B(); //object of B 
		bobj.a=30;
		bobj.b=10;
		bobj.print();
		bobj.display();
		
		C cobj=new C();
		cobj.c=90;
		cobj.print1(); //object of C 
		cobj.a=80;
		cobj.b=99;
		cobj.display();
		cobj.print();
		
		
		
	}
	
	
	

}
