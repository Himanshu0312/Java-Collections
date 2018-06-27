package com.java.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListPrac {

	static int count = 1;

	public static void main(String[] args) {

		List<Integer> iList = new LinkedList<Integer>();
		iList.add(2);
		iList.add(5);
		iList.add(1);
		iList.add(9);

		Iterator<Integer> itr = iList.iterator();

		while (itr.hasNext()) {
			System.out.println(String.format("%-20s= %s", count, itr.next()));
			count++;
		}
		count = 1;

		//iList.add(2, "Rahul");
		Collections.sort(iList);

		itr = iList.iterator();
		System.out.println("*****************************************");
		while (itr.hasNext()) {
			System.out.println(String.format("%-20s= %s", count, itr.next()));
			count++;
		}

	}
}
