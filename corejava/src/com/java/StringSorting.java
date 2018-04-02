package com.java;

import java.util.Arrays;

public class StringSorting {
	public static void sorting(String[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
private static String logestString(String[]arr){
	Arrays.sort(arr);
	int max = 0;
	String logestString = null;
	for(String a:arr){
		if(a.length()>max){
			max = a.length();
			logestString = a;
		}
	}
	return logestString;
}
	public static void main(String[] args) {
		String[] arr = { "sham", "ram", "dharmpal", "kansujia", "Aman", "dharmpalkansujia", "maa", "venu" };
		sorting(arr);
		System.out.println();
		System.out.println(logestString(arr));
	}
}