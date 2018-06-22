package com.java;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	
	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("A");
		linkedHashSet.add("C");
		linkedHashSet.add("B");
		linkedHashSet.add("B");
		linkedHashSet.add(null);
		linkedHashSet.add("E");
		linkedHashSet.add("D");
		
Iterator<String> itr=linkedHashSet.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	}
