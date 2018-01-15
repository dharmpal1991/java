package com.java.stringdemo;

public class StringDemo12 {
	public static void main(String[] args) {
		String s1 = new String("Dharmpal");
		String s2 = new String("Dharmpal");
		String s3 = new String("dharmpal");
		System.out.println(s1+"\t"+s2+"\t"+s3);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println("------------");
		System.out.println("ABC".compareTo("ABC"));
		System.out.println("ABC".compareTo("ADO"));
		System.out.println("ABC".compareTo("ABCDEFGHI"));
		System.out.println("ABCDEFG".compareTo("ABCDE"));
		System.out.println("ABC".compareTo("abc"));
		System.out.println("ABC".compareToIgnoreCase("abc"));
		int ab = 98;
		String s4 =String.valueOf(ab);
		String s5 =String.valueOf(ab);
		System.out.println(s4+"\t"+s5);
	}
}
