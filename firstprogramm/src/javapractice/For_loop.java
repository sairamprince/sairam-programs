package javapractice;

public class For_loop 
{
	public static void main(String sai[])
	{
		//for loop
		/*int i;
		 for(i=1;i<=15;i++)
		{
		System.out.println(i);
		}
	}*/

		
	//for each loop
		int arr[]= {10,15,15,20};  
		   int total=0;  
		   for(int i:arr){  
		     total=total+i;  
		     /*
		      *0 + 10 = 10
		      *10 + 15 = 25
		      *25 + 15 = 40
		      *40 + 20 = 60
		      * */
		      
		   }  
		  System.out.println("Total: "+total);  
}
}
