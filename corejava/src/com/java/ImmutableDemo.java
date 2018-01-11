package com.java;

public class ImmutableDemo {
	public static void main(String[] args) {
		Student s = new Student(101, "dharmpal", 896806588);
		Student s1 = new Student(102, "dharmpal", 896806588);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s == s1);
	}
	
}
final class Student{
	private final int id;
	private final String name;
	private final long phone;
	public Student(int id, String name, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getPhone() {
		return phone;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
}
