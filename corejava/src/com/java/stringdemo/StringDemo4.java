package com.java.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
	public static void main(String[] args) {
		String s1 = "dharmpal";
		String s2 = "dharmpal";
		System.out.println(s1==s2);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s3 = sc.nextLine();
		System.out.println("Reenter a String");
		String s4 = sc.nextLine();
		System.out.println(s3==s4);
	}

}
