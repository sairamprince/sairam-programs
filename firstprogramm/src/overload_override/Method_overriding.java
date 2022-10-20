package overload_override;
class bank
{
	double rateofINTREST()
	{
		return 0;
	}
}

class sbi extends bank
{
	double rateofINTREST()
	{
		return 10.9;
	}
	
	
}

class icici extends bank
{
	double rateofINTREST()
	{
		return 9.10;
	}
	
}
class hdfc extends bank
{
	double rateofINTREST()
	{
		return 8.09;
	}
}



public class Method_overriding {
	public static void main(String[] args)
	{
		sbi SBI=new sbi();
		System.out.println(SBI.rateofINTREST());
		
		icici ICICI=new icici();
		System.out.println(ICICI.rateofINTREST());
		
		hdfc HDFC=new hdfc();
		System.out.println(HDFC.rateofINTREST())
;	}

}
