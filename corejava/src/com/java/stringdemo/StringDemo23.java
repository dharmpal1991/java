package com.java.stringdemo;

public class StringDemo23 {
	public static void main(String[] args) {
		String s1 = "dharmpal kansujia";
		String s2 = "dharmpal kansujia";
		boolean b1 = s1.regionMatches(2, s2, 5, 10);
		System.out.println(b1);
		
		String str ="B";
		StringBuffer sb = new StringBuffer("B");
		System.out.println(str.hashCode());
		System.out.println(sb.hashCode());
		System.out.println(str.contentEquals(sb));
		
		StringBuffer sb1 = new StringBuffer("A");
		StringBuffer sb2 = new StringBuffer("A");
		System.out.println(sb1.equals(sb2));
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		System.out.println(str1.equals(str2));
	}

}
