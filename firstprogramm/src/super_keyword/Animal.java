package super_keyword;

public class Animal {
	String colour="white";
	void eating()
	{
		System.out.println("eating");
	}
	
	Animal()
	{
		System.out.println("animal is created");
	}

}
class dog extends Animal
{
	String colour="black";
	
	dog()
	{
		super();//invoked parent class constructor
		System.out.println("dog is created");
		
	}
	
	void display()
	{

		System.out.println(colour);
		System.out.println(super.colour);
	}
	
	void eating()
	{
		System.out.println("eating bread");
		super.eating();
	}
	
	
}

