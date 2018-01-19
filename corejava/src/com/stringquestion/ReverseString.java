package com.stringquestion;

public class ReverseString {
	public static String addThenReverseString(String str1,String str2){
		String s1 = str1;
		String s2 = str2;
		String s3 = s1+s2;
		String string = "";
		char [] ch = s3.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			string = string+ch[i];
		}
		return string;
	}
	public static void main(String[] args) {
		String st1 = "dharmpal";
		String st2 = "kansujia";
		System.out.println(addThenReverseString(st1, st2));
	}
}
