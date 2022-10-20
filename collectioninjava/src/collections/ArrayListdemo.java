package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListdemo {
	public static void main(String[] args) {
		//Declare ArrayList
		
		//ArrayList al=new ArrayList();
		//ArrayList <Integer> al=new ArrayList <Integer>();
		//ArrayList <String> al=new ArrayList <String>();
		//List al=new ArrayList();
		ArrayList al=new ArrayList();
		
		
		//Add new elements to the ArrayList
		al.add(200);
		al.add("sai");
		al.add('b');
		al.add(true);
		al.add(18.06);
		
		System.out.println(al);
		
		//size of ArrayList
		System.out.println("number of elements in ArrayList: "+al.size());
		
		
		//remove
		al.remove(3); //here 3 is an index
		al.remove(18.06); //here 18.06 is an element
		System.out.println("after removing the element: "+al);
		
		//add a new element by using index number
		al.add(3,"sri");
		System.out.println("after inserting the element: "+al);
		
		//retreive specific element
		System.out.println(al.get(3)); //here 2 is index/object
		
		//change/replace a element
		al.set(2,'s');
		System.out.println("after replacing the element: "+al);
		
		//contains / search
		System.out.println(al.contains("sri")); //returns True/False
		System.out.println(al.contains("prince"));
		
		//isEmpty()
		System.out.println(al.isEmpty());	
		
		//for loop
		System.out.println("reading elememts using for loop----------");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
		//for each loop......
		/*System.out.println("read elements using for each loop");
		for(Object e:al)
		{
			System.out.println(e);
			
		}*/
		
		//iterator
		/*System.out.println("-----------read elements using iterator method-------");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
	}

}
