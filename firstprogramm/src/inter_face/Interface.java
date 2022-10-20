package inter_face;

interface bank
{
	void deposit();
	void withdraw();
	void loan();
}
class  customer implements bank
{
	 public void deposit()
	{
		System.out.println("you can deposite money in bank upto 2000000");
	}
	 public void withdraw()
	{
		System.out.println("you can withdraw money upto 1000000");
	}
	 public void loan()
	{
		System.out.println("you can get loan upto 1000000");
	}

}


		