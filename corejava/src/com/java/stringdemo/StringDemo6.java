package com.java.stringdemo;

public class StringDemo6 {
	public static void main(String[] args) {
		String s1 = "dharmpal";
		String s2 = "kansujia";
		String s3 = s1+s2;
		System.out.println(s3);
		String s4 = s1+"kansujia";
		System.out.println(s4);
		String s5 = "dharmpal"+s2;
		System.out.println(s5);
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s3==s5);
		System.out.println(s4==s5);
		
	}
}
