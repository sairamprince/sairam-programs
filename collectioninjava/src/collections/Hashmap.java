package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put(201,"sai");
		hm.put(202, "sri");
		hm.put(203,"ram");
		hm.put(204,"sai");
		System.out.println(hm);
		
		//get key from HashMap
		System.out.println(hm.get(204));
		
		//remove pair from HashMap
		hm.remove(201);
		System.out.println(hm);
		
		//contains
		System.out.println(hm.containsKey(202));
		System.out.println(hm.containsKey(205));
		
		System.out.println(hm.containsValue("chinnu"));
		
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.keySet()); //returns all the keys as set
		
		System.out.println(hm.values()); //returns all the values as collection
		
		System.out.println(hm.entrySet());//returns all the entries as set 
		
		
		//Entry methods
		//********************
		/*Set s=hm.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Entry) it.next();
			System.out.println(entry.getKey()+"       "+entry.getValue());
		}*/
		
		
			
	}

}
