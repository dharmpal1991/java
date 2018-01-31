package com.java;

public class Anagram {
	static int count = 0;

	public static int anagram(String[] a, String[] b) {
		for (int i = 0; i < a.length; i++) {
			String str1 = a[i];
			sortCheck(str1);
			System.out.println(str1);
			
		}
		for(int j=0;j<b.length; j++){
			String str2 = b[j];
			System.out.println(str2);
			break;
		}
		return count;
	}
	private static int sortCheck(String str1){
		return count;
		
	}

	public static void main(String[] args) {
		String[] a = { "a", "ab", "abc", "abcd" };
		String[] b = { "ab", "ba", "abcd", "defghi" };
		System.out.println(anagram(a, b));
	}

}
