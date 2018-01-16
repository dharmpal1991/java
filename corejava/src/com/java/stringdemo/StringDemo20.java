package com.java.stringdemo;

public class StringDemo20 {
	public static void main(String[] args) {
		char c1[] = {'d','h','a','r','m','p','a','l'};
		byte b1[] = {65,66,67,68,97,98,99,49,50};
		String s1 = new String(c1);
		String s2 = new String(b1);
		System.out.println(s1);
		System.out.println(s2);
		String s3 = new String(c1,3,5);
		String s4 = new String(b1,3,5);
		System.out.println(s3);
		System.out.println(s4);
	}

}
