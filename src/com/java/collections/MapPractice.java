package com.java.collections;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(3, "Amit");
		map.put(2, "Vijay");
		map.put(5, "Deepika");
		map.put(4, "Raman");
		map.put(4, "Ram");
		map.put(1, "Rahul");
		System.out.println("The Map elements:");
		
		System.out.println(map.hashCode());
		//System.out.println(map.firstKey());
		//map.remove(3);
		//map.clear();
		//System.out.println(map.values());
		
		for (Map.Entry mEntry : map.entrySet()) {
			System.out.println(mEntry.getKey()+" :: "+mEntry.getValue());
		}
	}
}
