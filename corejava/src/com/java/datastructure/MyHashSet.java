package com.java.datastructure;

import java.util.HashMap;
import java.util.Iterator;

public class MyHashSet<E> {
	private transient HashMap<E,Object>map;
	
	public MyHashSet(){
		map = new HashMap<>();
	}
	public MyHashSet(int initialCapacity,float loadFactor){
		map = new HashMap<>(initialCapacity,loadFactor);
	}
	public MyHashSet(int initialCapacity){
		map = new HashMap<>(initialCapacity);
	}
	public Iterator<E> iterator(){
		return map.keySet().iterator();
	}
	public boolean contain(Object o){
		return map.containsKey(o);
	}
	public String toString(){
		return "MyHashSet ["+map+"]";
	}
	public boolean add(E o){
		return map.put(o,"")== null;
	}
	public boolean remove(Object o){
		return (map.remove(o)!=null);
	}
	public static void main(String[] args) {
		MyHashSet<Integer> set = new MyHashSet<>();
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(10);
		System.out.println(set);
	}
}
