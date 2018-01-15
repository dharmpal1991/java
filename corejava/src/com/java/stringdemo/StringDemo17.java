package com.java.stringdemo;

public class StringDemo17 {
	public static void main(String[] args) {
		String s1 = "dharmpal";
		String s2 = s1.trim();
		System.out.println(s1+"\t"+s2);
		System.out.println(s1==s2);
		String s3 = " dharmpal  ";
		String s4 = s3.trim();
		System.out.println(s3.length()+"\t"+s4.length());
		System.out.println(s3==s4);
		String s5 ="";
		System.out.println(s5.length());
		System.out.println(s5.isEmpty());
	}

}
