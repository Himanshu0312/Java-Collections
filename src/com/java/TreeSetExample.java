package com.java;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("B");
		treeSet.add("B");
		//treeSet.add(null);
		treeSet.add("E");
		treeSet.add("D");
		
Iterator<String> itr=treeSet.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
