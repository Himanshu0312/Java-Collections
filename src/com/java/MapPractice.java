package com.java;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "Amit");
		map.put(1, "Vijay");
		map.put(2, "Karan");
		map.put(3, "Raman");
		map.put(4, "Jai");
		map.put(5, "Rahul");
		System.out.println("The Map elements:");
		
		System.out.println(map.values());
		
		map.remove(3);
		
		for (Map.Entry mEntry : map.entrySet()) {
			System.out.println(mEntry.getKey()+" :: "+mEntry.getValue());
		}
	}
}
