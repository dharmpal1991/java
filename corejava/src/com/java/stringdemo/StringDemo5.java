package com.java.stringdemo;

import java.util.Scanner;

public class StringDemo5 {
	public static void main(String[] args) {
		String s1 = "dharmpal";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s2 = sc.nextLine();
		System.out.println("Enter a String");
		String s3 = sc.nextLine();
		String s4 = s2.intern();
		String s5 = s3.intern();
		System.out.println(s3==s4);
		System.out.println(s5==s4);
		System.out.println(s1==s5);
	}

}
