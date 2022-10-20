package collections;

import java.util.HashSet;

public class Hash_set2 {
	public static void main(String[] args)
	{
		HashSet <Integer> evenNumber=new HashSet <Integer> ();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("HashSet:"+evenNumber);
		
		HashSet <Integer> number=new HashSet <Integer> ();
		number.addAll(evenNumber);
		number.add(10);
		System.out.println("new Hashset:"+number);
		
		//removeAll
		
		number.removeAll(evenNumber);
		System.out.println(number);
		
	}

}
