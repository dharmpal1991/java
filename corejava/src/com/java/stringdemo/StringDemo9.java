package com.java.stringdemo;

public class StringDemo9 {
	public static void main(String[] args) {
		String s1 = "dharmpal1991";
		final String s2 = "dharmpal";
		final int ab = 1991;
		String s3 = s2+ab;
		String s4 = "dharmpal"+ab;
		System.out.println(s1+"\t"+s3+"\t"+s4);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
	}

}
