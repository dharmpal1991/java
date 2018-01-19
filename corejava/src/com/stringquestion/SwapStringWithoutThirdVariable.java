package com.stringquestion;

public class SwapStringWithoutThirdVariable {
	public static void swapString(String str1,String str2){
		String a = str1;
		String b = str2;
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length(),a.length());
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		String s1 = "dharmpal";
		String s2 = "kansujia";
		swapString(s1, s2);
	}

}
