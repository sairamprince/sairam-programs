package static_var_method;

public class Static_variable_method {
	static int a=10;//static variable
	int b=50;//non-static variable
	
	static void m1()
	{
		System.out.println("this is m1 = static method");
	}
	
	void m2()
	{
		System.out.println("this is m2 = non static method");
	}
	
	public static void main(String[] args)
	{
		
		System.out.println(a);
		m1();
		//System.out.println(b); incorrect because b is non static
		//m2(); incorrect m2 is non static method
		Static_variable_method svm=new Static_variable_method();
		System.out.println(svm.b);//non static method through object
		svm.m2();
		
	}
	

}
