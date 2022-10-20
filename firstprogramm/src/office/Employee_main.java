package office;

public class Employee_main {
	public static void main(String[] args)
	{
		Employee emp1=new Employee(9999,"prince",20000,"DEV");//3.assign values by using constructor
		
		//1.assign values by using reference variables
		/*emp1.empid=6300;
		emp1.empname="sri";
		emp1.empsalary=30000;
		emp1.emprole="Quality Assurance";
		emp1.display();
		
		Employee emp2=new Employee();
		
		emp2.empid=2917;
		emp2.empname="sai";
		emp2.empsalary=35000;
		emp2.emprole="Developer";
		emp2.display();*/
		
		//2.assign values by using method
		//emp1.getvalues(1234,"prince",50000,"QA");
		emp1.display();
		
		
		
		
		
		}

}
