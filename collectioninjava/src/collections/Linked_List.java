package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {
	public static void main(String[] args)
	{
		//declare Linked list
		
		//LinkedList l=new LinkedList();
		//LinkedList <String> 1=new LinkedList <String> ();
		LinkedList l=new LinkedList();
		
		//add elements into linked list
		l.add(99);
		l.add("sai");
		l.add('b');
		l.add(66.00);
		l.add(null);
		l.add(true);
		l.add(false);
		System.out.println(l);
		
		//remove
		l.remove(3);
		System.out.println(l);
		
		//insertion/adding elements to middle of linked list
		l.add(3,"prince");
		System.out.println("After inserting the elements :"+l);
		
		//retreving values/objects
		System.out.println(l.get(2));
		
		//change the value
		l.set(4,"ram");
		System.out.println(l);
		
		//contains()
		System.out.println(l.contains('b'));
		
		//isEmpty()
		System.out.println(l.isEmpty());
		
		//reading elements from LinkedList
		/*for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}*/
		
		//reading elements from LinkedList by using for each loop
		for(Object e:l)
		{
			System.out.println(e);
		}
		
		//reading the values from Linked list by using iterator
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
