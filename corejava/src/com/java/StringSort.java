package com.java;

public class StringSort {
	private static void stringSort(String str){
		char temp;
		char [] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++){
			for(int j = 0;j<ch.length;j++){
				if(ch[i] > ch[j]){
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
	}
	public static void main(String[] args) {
		String s1 = "dharmpal kansujia";
		stringSort(s1);
	}

}
