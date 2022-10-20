package final_keyword;

class bike
{
	final void run() //final method, we cannot override this method in child class
	{
		System.out.println("running.....");
	}
}
class honda extends bike
{ 
	//void run() //compile time error
	{
		System.out.println("started.....");
	}
	
}
public class Final_method {

}
