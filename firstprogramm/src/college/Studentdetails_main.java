package college;

public class Studentdetails_main {
	public static void main(String[] args)
	{
		 Student_details stud1=new  Student_details();//creating object of Student_details 
		 
		 stud1.collegename="Lbrce";
		 stud1.studentname="sai ram";
		 stud1.rollno=18;
		 stud1.department="EEE";
		 stud1.percentage=70.01;
		 stud1.mobileno="6305152917";
		 stud1.display();
		 
		 Student_details stud2=new Student_details();//creating another object of Student_details
		 
		 stud2.collegename="Lbrce";
		 stud2.studentname="sri";
		 stud2.rollno=06;
		 stud2.department="CSE";
		 stud2.percentage=90.55; 
		 stud2.mobileno="6300807378";
		 stud2.display();
	}

}
