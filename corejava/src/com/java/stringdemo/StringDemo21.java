package com.java.stringdemo;

public class StringDemo21 {
	public static void main(String[] args) {
		String s1 = "dharmpal kansujia bodi wala pitha";
		String[] st = s1.split("a", 3);
		for (String s : st) {
			System.out.println(s);
		}
		String s2 = "[A-Z]";
		System.out.println("H".matches(s2));
		System.out.println("S".matches(s2));
		System.out.println("s".matches(s2));
		System.out.println("HI".matches(s2));
	}

}
