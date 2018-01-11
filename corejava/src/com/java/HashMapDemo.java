package com.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101, "dharmpal");
		map.put(105, "pitha");
		map.put(104, "wala");
		map.put(103, "bodi");
		map.put(102, "kansujia");
		System.out.println(map);
		Set<Integer> s = map.keySet();
		System.out.println(s);
		Collection<String> c = map.values();
		System.out.println(c);
		Set s1 = map.entrySet();
		Iterator it = s1.iterator();
		while(it.hasNext()){
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey()+"--"+entry.getValue());
			if(entry.getKey().equals(103)){
				entry.setValue("dharmpalkansujia");
			}
		}
		System.out.println(map);
	}

}
