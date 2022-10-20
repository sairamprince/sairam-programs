package Array;

public class Single_dimensional_array {
	public static void main(String[] args)
	{
	
		//int a[]=new int[5]; //declare array with size 5
		//inserting values into the array
		
		/*a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		int a[]= {100,200,300,400,500}; //declare an array without specifying size
		System.out.println("length of an array :"+a.length);
		System.out.println(a[4]);
		/*for(int i=0;i<=a.length-1;i++) //for(int i=0;i<a.length)
		{
			System.out.println(a[i]);
		}*/
		//read values by using enhanced for loop
		for(int i:a)
		{
			System.out.println(i);//100 200 300 400 500
		}
	
	}
}
