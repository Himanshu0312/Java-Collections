package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrListPrac {
	public static void main(String[] args) {
		
		List<String> sArrList = new ArrayList<String>();
		sArrList.add("Ravi");
		sArrList.add("Vijay");
		sArrList.add("Dinesh");
		sArrList.add("Ajay");
		sArrList.add("******");
		
		Iterator<String> itr=sArrList.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(sArrList.size());
		
		sArrList.add(2, "Rahul");
		itr=sArrList.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}	
		System.out.println(sArrList.size());
		sArrList.remove(2);
		itr=sArrList.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}	
		System.out.println(sArrList.size());
		
	}
}
