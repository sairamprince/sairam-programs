package Loops;
 public class Evennumbers 
{
	 int rollno;
	 String name;
	 static String collegename;
	 Evennumbers(int r, String n)
	 {
		 rollno=r;
		 name=n;
		 
	 }
	 void display()
	 {
		 System.out.println(rollno+ ""+ name + " "+ collegename);
		 
	 }
	public static void main(String[] args)
	{
		Evennumbers s1=new Evennumbers(7867, "mounika");
		Evennumbers s2=new Evennumbers(958409,"dkjflkdj");
		s1.display();
		s2.display();
					
	}
}
