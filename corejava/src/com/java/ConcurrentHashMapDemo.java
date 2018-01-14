package com.java;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(101, "dharmpal");
		map.put(102, "kansujia");
		map.put(101, "bodiwalapitha");
		System.out.println(map);
		map.putIfAbsent(102, "abhi");
		System.out.println(map);
	//	map.remove(101);
		map.remove(101, "bodiwalapitha");
		System.out.println(map);
		map.replace(102, "kansujia", "bodiwalapitha");
		System.out.println(map);
		
		CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
		l.add("A");
		l.add("A");
		l.add("B");
		System.out.println(l);
		l.addIfAbsent("a");
		l.addIfAbsent("A");
		System.out.println(l);
	}

}
