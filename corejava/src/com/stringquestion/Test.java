package com.stringquestion;

public class Test {
	public static void main(String[] args) {
		String s1 = new String("ABCD");
		String s2 = new String("ABCD");
		if (s1 == s2) {
			System.out.println("s1==s2 is true");
		} else
			System.out.println("s1==s2 is false");
		String s3 = s2;
		if (s2 == s3) {
			System.out.println("String 2 == String 3 is true");
		} else {
			System.out.println("String 2 == String 3 is false");
		}
		if (s1.equals(s2)) {
			System.out.println("String 1 equals string 2 is true");
		} else {
			System.out.println("String 1 equals string 2 is false");
		}
	}

}
