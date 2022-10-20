package firstprogramm;

public class operatorsinjava 
{
	public static void main(String[] args)
	{
	int a=10; // '=' this is an assignment operator 
	int b=20;
	//arithmetic operators---> + - * % /
	System.out.println("--------arithmetic operators---------");
	System.out.println("sum of a and b is:" +(a+b));
	System.out.println("subtraction of a and b is:" +(a-b));
	System.out.println("multiplication  of a and b is:" +(a*b));
	System.out.println("div of a and b is:" +(a/b));
	System.out.println("mod of a and b is:" +(a%b));
	
	//relational operators--->  == < > <= >= !=
	//always returns boolean values
	System.out.println("---------relational operators-----------");
	System.out.println(a==b);//false
	System.out.println(a!=b);//true
	System.out.println(a<b);//true
	System.out.println(a>b);//false
	System.out.println(a<=b);//true
	System.out.println(a>=b);//false
	
	//logical operators && || !
	//works between two boolean
	System.out.println("----------logical operators------------");
	boolean x=true;
	boolean y=false;
	System.out.println(x && y);
	System.out.println(x || y);
	System.out.println(!x);
	
	//increment or decrement operators---> ++ --
	System.out.println("---------increment & decrement operators------");
	a=10;
	//a=a+1;
	a++;
	System.out.println(a);
	b=20;
	//b=b-1;
	b--;
	System.out.println(b);
	
	
	
	
	
	
	
	}
	

}
