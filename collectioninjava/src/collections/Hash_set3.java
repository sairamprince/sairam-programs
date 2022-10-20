package collections;

import java.util.HashSet;

public class Hash_set3 {
	public static void main(String[] args)
	{
		HashSet <Integer> set1=new HashSet <Integer> ();
		//union, intersection, difference
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println("Hashset1 :"+set1);
		
		HashSet <Integer> set2=new HashSet <Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("Hashset2 :"+set2);
		
		//union
		set1.addAll(set2);
		System.out.println("union :"+set1);
		
		//Intersection
		set1.retainAll(set2);
		System.out.println("intersection :"+set1);
		
		//difference
		set1.removeAll(set2);
		System.out.println("difference :"+set1);
		
		//subset
		System.out.println(set1.containsAll(set2));
		System.out.println("subset :"+set1);
		
		
	}

}
