package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("A");
		hashSet.add("C");
		hashSet.add("B");
		//hashSet.add(null);
		hashSet.add("E");
		hashSet.add("D");
		
Iterator<String> itr=hashSet.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
}
