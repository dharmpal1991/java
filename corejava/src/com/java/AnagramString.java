package com.java;

import java.util.Arrays;

public class AnagramString {
	private static boolean anagramString(String str1,String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		str1 = characterSort(str1);
		str2 = characterSort(str2);
		return str1.equals(str2);
	}
	private static String characterSort(String str){
		char[] ch = str.toLowerCase().toCharArray();
		Arrays.sort(ch);
		return String.valueOf(ch);
	}
	public static void main(String[] args) {
		String s1 = "poonam";
		String s2 = "nampoo";
		if(anagramString(s1, s2))
			System.out.println("String is Anagarm");
		else
			System.out.println("String is not Anagram");
	}

}
