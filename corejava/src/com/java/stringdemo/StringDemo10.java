package com.java.stringdemo;

public class StringDemo10 {
	public static void main(String[] args) {
		String s1 = "dharmpal";
		String s2 = "kansujia";
		String s3 =s1.concat(s2);
		System.out.println(s3);
		String s4 = "dharmpalkansujia";
		System.out.println(s3==s4);
		System.out.println(s1==s4);
	}

}
