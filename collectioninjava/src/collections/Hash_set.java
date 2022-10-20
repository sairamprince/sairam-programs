package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {
	public static void main(String[] args)
	{
		//HashSet hs=new HashSet(100); // initial capacity 100
		//HashSet hs=new HashSet(100, (float)0.90);  
		//HashSet <Integer> hs=new HashSet <Integer> ();
		HashSet hs=new HashSet();//default capacity 16 load factor 0.75
		
		//add objects/elements into HashSet
		hs.add("sai");
		hs.add('b');
		hs.add(123);
		hs.add(9.57);
		hs.add(true);
		hs.add(null);
		System.out.println(hs); //insertion order not preserved
		
		//remove
		hs.remove(9.57);
		System.out.println("after removing element :"+hs);
		
		//contains
		System.out.println(hs.contains('b'));
		System.out.println(hs.contains("princr"));
		
		//reading objects/elements from HashSet using fr each loop
		/*for(Object e:hs)
		{
			System.out.println(e);
		}*/
		
		//using Iterator method
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		}

}
 