package com.java.string;

public class PalandromString {
	public static void palindromString(String str){
		String original = str;
		String string = "";
		for(int i=original.length()-1;i>=0;i--){
			string = string+original.charAt(i);
		}
		if(original.equals(string)){
			System.out.println("String Palindrom");
		}
		else
			System.out.println("String is not Palindrom");
	}
	public static void main(String[] args) {
		String s = "madam";
		palindromString(s);
	}
}
