package arraylist;

import java.util.ArrayList;

public class Array_list_demo {
	public static void main(String[] args)
	{
		//how to declare array list
		ArrayList list=new ArrayList();//we can store any type of elements
		//ArrayList <String> list=new ArrayList <String> ();//String
		/*ArrayList <Integer> list1=new ArrayList <Integer> ();*/ //integer
		
		//Adding values to ArrayList
		
		list.add("sai ram");
		list.add("prince");
		list.add("sri");
		list.add(12234);
		list.add('s');
		
		//size of ArrayList
		
		System.out.println(list.size());
		System.out.println("before removing the element--> "+list); //3
		
		//remove an element
		
		list.remove(1);
		System.out.println(list.size());
		System.out.println("after removing the element--> "+list); 
		
		
		//inserting a new element in array list
		
		list.add(1,"chinnu");
		System.out.println(list.size());
		System.out.println("after inserting the element--> "+list);
		
		//read values from array list using for loop
		for(Object s:list) //object type variable can hold any type of values
		{
			System.out.println(s);
		}
	}

}
