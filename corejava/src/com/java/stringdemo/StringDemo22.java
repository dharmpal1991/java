package com.java.stringdemo;

public class StringDemo22 {
	public static void main(String[] args) {
		String s1 = "[A-Z]*";
		System.out.println("HI".matches(s1));
		System.out.println("S".matches(s1));
		System.out.println("DHRAMPAL".matches(s1));
		System.out.println("KANSUJIA".matches(s1));
		System.out.println("dk".matches(s1));
		System.out.println("------------------");
		String s2 = "[A-Za-z0-9]*";
		System.out.println("S".matches(s2));
		System.out.println("Dharmpal".matches(s2));
		System.out.println("KANSUJIA".matches(s2));
		System.out.println("dk1991".matches(s2));
		System.out.println("S@".matches(s2));
		System.out.println("--------------");
		String s3 ="^[A-Z][A-Za-z0-9]*";
		System.out.println("Dharmpal".matches(s3));
		System.out.println("KANSUJIA".matches(s3));
		System.out.println("dk1991".matches(s3));
		System.out.println("S@".matches(s3));
		System.out.println("---------------");
		String s4 = "DK";
		String s5 = new String("DK");
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s4==s5);
	}

}
