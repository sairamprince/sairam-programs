package final_keyword;

final class mobile  //final class, so we cannot extend into child class
{
	int ram=6;
	void display()
	{
		System.out.println("ram");
	}
}
class realme extends mobile
{
	void print()
	{
		System.out.println("realme ram")
	}
	
}
public class Final_class {

}
