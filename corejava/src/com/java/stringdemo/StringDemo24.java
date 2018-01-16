package com.java.stringdemo;

public class StringDemo24 {
	public static void main(String[] args) {
		Student2 st = new Student2(101, "dharmpal", 896806588);
		Student2 st2 = new Student2(101,"dharmpal" , 896806588);
		System.out.println(st);
		System.out.println(st2);
		System.out.println(st.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st==st2);
		System.out.println(st.equals(st2));
	}

}
final class Student2{
	private final int sid;
	private final String name;
	private final long phone;
	
	public Student2(int sid,String name,long phone){
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}
	public int getSid(){
		return sid;
	}
	public String getName(){
		return name;
	}
	public long getPhone(){
		return phone;
	}
	public String toString(){
		return "Sid:"+sid+",Name:"+name+",Phone:"+phone;
	}
}