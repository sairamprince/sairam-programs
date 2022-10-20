package collections;

import java.util.PriorityQueue;

public class Priority_queue {
	public static void main(String[] args)
	{
		PriorityQueue pq=new  PriorityQueue();
		
		//adding elements add() / offer()
		pq.add("a");
		pq.add("b");
		pq.add("c");
		pq.offer("c");
		System.out.println(pq); //insertion order preserved and duplicated allowed
		
		//get head element   element() peak()
		System.out.println(pq.element());//returns head element, if empty returns NoSuchElementException
		//System.out.println(pq.peek());//returns head element, if empty returns null
	
		//returns and remove element from queue remove() pool()
		System.out.println(pq.remove());
		System.out.println(pq);
		//System.out.println(pq.pool())
	}

}
