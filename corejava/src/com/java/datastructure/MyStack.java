package com.java.datastructure;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
	private int size=0;
	private int capacity = 0;
	private Object[] element;
	
	public MyStack(){
		capacity = 10;
		element = new Object[capacity];
	}
	public Object push(Object e){
		if(size == capacity){
			relocate();
		}
		element[size] = e;
		++size;
		return e;
	}
	private void relocate() {
		int  newCapacity = capacity*2;
		element = Arrays.copyOf(element, newCapacity);
	}
	public Object pop(){
		Object e = peak();
		--size;
		return e;
	}
	private Object peak() {
		if(size == 0)
			throw new EmptyStackException();
		return element[size-1];
	}
	public String toString(){
		StringBuffer sb = new StringBuffer("{");
		for(int i=0;i<size;i++){
			sb.append(element[i]+",");
		}
		return sb.substring(0,sb.length()-1)+"}";
	}
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("123");
		stack.push("abc");
		stack.push("dharmpal");
		stack.push("kansujia");
		stack.push("hello");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peak());
		stack.push("hi");
		System.out.println(stack);
	}
}
