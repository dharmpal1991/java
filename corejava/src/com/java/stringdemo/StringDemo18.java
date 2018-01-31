package com.java.stringdemo;

public class StringDemo18 {
	public static void main(String[] args) {
		String s1 = "Hai,dharmpal kansujia";
		System.out.println(s1.startsWith("Hai"));
		System.out.println(s1.endsWith("ia"));
		System.out.println(s1.startsWith("dhar", 4));
		System.out.println(s1.indexOf(97));
		System.out.println(s1.lastIndexOf(97));
		System.out.println(s1.indexOf("dharmpal"));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(4, 12));
		System.out.println(s1.charAt(4));
	}
}
