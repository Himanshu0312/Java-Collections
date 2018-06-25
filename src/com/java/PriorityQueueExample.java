package com.java;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Iterator<String> itr;
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");
		System.out.println("queue.element() is " + queue.element());
		System.out.println("queue.peek() is " + queue.peek());
		System.out.println("iterating the queue elements:");
		itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("queue.remove() removes " + queue.remove());
		System.out.println("queue.poll() removes " + queue.poll());
		System.out.println("after removing two elements queue now looks like:");
		itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
