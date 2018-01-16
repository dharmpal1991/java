package com.java.stringdemo;

public class StringDemo19 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String s1 = "dharmpal";
		char [] c1 = new char[10];
		byte [] b1 = new byte[10];
		c1[0] ='k';
		c1[1] ='a';
		c1[2] ='n';
		s1.getChars(3, 7, c1, 4);
		s1.getBytes(3, 7, b1, 4);
		System.out.println("char Array");
		for(int i=0;i<c1.length;i++){
			System.out.println(i+"\t"+c1[i]);
		}
		System.out.println("byte Array");
		for(int i=0;i<b1.length;i++){
			System.out.println(i+"\t"+(char)b1[i]);
		}
	}

}
