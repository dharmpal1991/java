package com.java.stringdemo;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = "dharmpal";
		String s2 = new String("dharmpal");
		String s3 = new String("dharmpal");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
	}
}
