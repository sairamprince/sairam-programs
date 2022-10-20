package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_table {
	public static void main(String[] args)
	{
		/*Hashtable ht=new Hashtable(); //capacity is 11 and load factor is 0.75*/
		//Hashtable ht=new(initial capacity); //create HashTable object with some capacity
		//Hashtable ht=new Hashtable(initial capacity, fill ratio/load factor)
		
		Hashtable <Integer,String> ht=new Hashtable <Integer,String> ();
		ht.put(110,"chinnu");
		ht.put(111,"prince");
		ht.put(112,"mahesh");
		ht.put(113, "sri");
		System.out.println(ht);
		
		System.out.println(ht.get(113));
		
		ht.remove(112);
		System.out.println("after removing :"+ht);
		
		System.out.println(ht.containsKey(343));
		System.out.println(ht.containsKey(112));
		
		System.out.println(ht.containsValue("sri"));
		System.out.println(ht.containsValue("xyz"));
		
		System.out.println(ht.isEmpty());
		
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		for(int k:ht.keySet())
		{
			System.out.println(k+"    "+ht.get(k));
			
		}
		
		//Entry specific methods
		for(Map.Entry entry:ht.entrySet())
		{
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		
		//iterator
		Set s=ht.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry entry= (Entry) it.next();
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
	}

}
