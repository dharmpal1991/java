package com.java.stringdemo;

public class StringDemo13 {
	public static void main(String[] args) {
		Student s = new Student();
		String s1 = String.valueOf(s);
		System.out.println(s1);
		Employee e = new Employee();
		String s2 = String.valueOf(e);
		System.out.println(s2);
	}

}
class Student{}
class Employee{
	int eid;
	public String toString(){
		return "Eid:"+eid;
	}
}
