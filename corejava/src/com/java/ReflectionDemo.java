package com.java;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student1{
	private String name;
	private int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}
public class ReflectionDemo {
	public static void main(String[] args) {
		Student1 s = new Student1();
		Class c	= s.getClass();
		System.out.println(c.getName());
		Method [] m = c.getDeclaredMethods();
		for(int i=0;i<m.length;i++){
			System.out.println(m[i]);
		}
		Field[] f = c.getDeclaredFields();
		for(int i=0;i<f.length;i++){
			System.out.println(f[i]);
		}
		
		System.out.println(String.class.getClassLoader());
		System.out.println(Student1.class.getClassLoader());
		Runtime r = Runtime.getRuntime();
		long mb = 1024*1024;
		System.out.println(r.maxMemory()/mb);
		System.out.println(r.totalMemory()/mb);
		System.out.println(r.freeMemory()/mb);
	}

}
