package com.java.stringdemo;

public class StringDemo7 {
	public static void main(String[] args) {
		String s1 = "dharmpalkansujia";
		String s2 = "dharmpal"+"kansujia";
		final String s3 ="dharmpal";
		final String s4 ="kansujia";
		String s5 = s3+s4;
		System.out.println(s1==s2);
		System.out.println(s3==s5);
		System.out.println(s1==s5);
	}

}
