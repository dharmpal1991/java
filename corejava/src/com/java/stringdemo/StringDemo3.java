package com.java.stringdemo;

public class StringDemo3 {
	public static void main(String[] args) {
		String s1 = "dharmpal";
		String s2 = new String("dharmpal");
		String s3 = s1.intern();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		String s4 ="ok".intern();
		String s5 = "OK";
		String s6 ="oK";
		String s7 = "ok";
		System.out.println(s4==s5);
		System.out.println(s5==s6);
		System.out.println(s4==s5);
		System.out.println(s7==s4);
	}

}
