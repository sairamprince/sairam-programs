package final_keyword;

public class Final_variable {
	int speed=100; //here we can change the variable value
	//final int speed=90; //if we write final keyword we cannot change the variable value
	
	public static void main(String[] args)
	{
		Final_variable fv=new Final_variable();
		//fv.speed=150;////compile time error
		fv.speed=150;
		System.out.println(fv.speed);

}
}



