package com.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeueExample
{
	public static void main(String[] args) {
		Iterator<String> itr;
		Deque<String> dque = new ArrayDeque<String>();
		dque.add("Amit");
		dque.add("Vijay");
		dque.add("Karan");
		dque.addFirst("Raman");
		dque.add("Jai");
		dque.addLast("Rahul");
		dque.offerLast("Ranjeet");
		
		System.out.println("iterating the queue elements:");
		
		itr = dque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("iterating the queue elements [NEW] :");
		
		/*while(dque.peek() != null) {
			System.out.println(dque.remove());
		}*/
	}
}
