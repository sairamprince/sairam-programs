package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_demo {
	public static void main(String[] args)
	{
		//declaration
		//HashMap hm=new HashMap();
		
		HashMap <Integer,String> hm=new HashMap <Integer,String> ();
			
		//adding pairs into HashMap
		
		hm.put(1234, "sai");
		hm.put(1235, "sri");
		hm.put(1236, "prince");
		hm.put(1237, "abcd");
		System.out.println(hm);
		
		//remove a pair from HashMap
		
		hm.remove(1237);
		System.out.println("after removing the pair: "+hm);
		
		//read the pairs using for loop
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"   "+m.getValue());
		}
	}

}
