package office;

public class Employee {
	int empid;
	String empname;
	int empsalary;
	String emprole;
	
	Employee (int id, String name, int salary, String role)//constructor
	{
		empid=id;
		empname=name;
		empsalary=salary;
		emprole=role;
		
	}
	
	void getvalues(int id, String name, int salary, String role)
	{
		empid=id;
		empname=name;
		empsalary=salary;
		emprole=role;
		
		
	}
	
	
	void display()
	{
		System.out.println(empid+"  "+empname+"  "+empsalary+"  "+emprole);
	
	}

}
