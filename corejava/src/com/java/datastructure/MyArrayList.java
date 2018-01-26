package com.java.datastructure;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList <E> {
	private int size=0;
	private int capacity=0;
	private Object[] element;
	
	private static final int DEFAULT_CAPACITY =10;
	
	public MyArrayList(){
		this(DEFAULT_CAPACITY);
	}

	public MyArrayList(int initCapacity) {
			capacity = initCapacity;
			element = new Object[capacity];
	}
	public boolean add(Object e){
		if(size == capacity){
			relocate();
		}
		element[size] = e;
		++size;
		return true;
	}
	private void relocate() {
		int newCapacity = capacity*3/2+1;
		element = Arrays.copyOf(element, newCapacity);
	}
	public void add(int index,Object e){
		if(index<0 ||index>size){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if(size == capacity){
			relocate();
		}
		for(int i=size;i>index;i--){
			element[i] = element[i-1];
		}
		element[index] = e;
		size++;
	}
	public void clear(){
		element = new Object[capacity];
		size = 0;
	}
	public boolean isEmpty(){
		return size ==0;
	}
	public Object get(int index){
		if(index<0 || index>=size){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return element[index];
	}
	public int indexOf(Object o){
		if(o == null){
			throw new NullPointerException();
		}
		for(int i=0;i<size;i++){
			if(element[i].equals(o)){
				return i;
			}
		}
		return -1;
	}
	public Object remove(int index){
		if(index<0 || index>=size){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		Object temp = element[index];
		for(int i=index+1;i<size;i++){
			element[i-1] = element[i];
		}
		size--;
		return temp;
	}
	public Object set(int index,E e){
		if(index<0 || index>=size){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if(e == null){
			throw new NullPointerException();
		}
		Object temp = element[index];
		element[index] = e;
		return temp;
	}
	public Iterator<E> iterator(){
		return iterator();
	}
	public void print(){
		int index = 1;
		Object temp = element[0];
		while(temp != null){
			System.out.println(" "+temp);
			++index;
			temp = element[index];
		}
	}
	public static void main(String[] args) {
		MyArrayList<Integer> l = new MyArrayList<>();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(11);
		l.add(2,100);
		l.print();
		l.set(5, 500);
		l.indexOf(500);
		l.remove(4);
		l.print();
		System.out.println(l.isEmpty());
	}
}
