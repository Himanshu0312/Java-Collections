package com.java.collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		Iterator<String> itr;
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Raman");
		queue.add("Jai");
		queue.add("Rahul");
		System.out.println("iterating the queue elements:");
		
		itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("iterating the queue elements [NEW] :");
		/*
		while(queue.peek() != null) {
			System.out.println(queue.remove());
		}*/
	}
}
