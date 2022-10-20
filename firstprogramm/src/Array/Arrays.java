package Array;

public class Arrays {
	public static void main(String[] args)
	{
		int a[]=new int[5];//declaration of an array with 5 elements
		//store elements in array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//read elements from an array
		for(int i=0;i<=4;i++)
		{
		System.out.println(a[i]);
		}
		System.out.println("        ");
		System.out.println(a.length);
		
		for(int i:a)
		{
			System.out.println(i);
			
		}
		String s[]=new String[5];
		s[0]="sai";
		s[1]="ram";
		s[2]="bindu";
		s[3]="sri";
		s[4]="prince";
		System.out.println(s.length);
		for(String i:s)
		{
			System.out.print(" "+i);
		}
		int b[]= {100,200,300,400,500};
		for(int i:b)
		{
			System.out.println(i);
		}
		
		Object c[]=new Object[5];
		c[0]="sai";
		c[1]='b';
		c[2]=20;
		c[3]=30.44;
		c[4]=true;
		for(Object i:c)
		{
			System.out.println(i);
		}
			
	}

}
