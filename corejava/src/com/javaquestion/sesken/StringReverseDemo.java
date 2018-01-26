package com.javaquestion.sesken;

public class StringReverseDemo {
	public static String reverse(String str){
		char [] charArray = str.toCharArray();
		int l = 0;
		int r = charArray.length-1;
		while(l<r){
			if(!Character.isAlphabetic(charArray[l])){
				l++;
			}
			else if(!Character.isAlphabetic(charArray[r])){
				r--;
			}
			else{
				char temp = charArray[l];
				charArray[l] = charArray[r];
				charArray[r] = temp;
				l++;
				r--;
			}
		}
		return new String(charArray);
	}
	public static void main(String[] args) {
		String str = "aba@a$f%df&g*iu!yu@h#l";
		System.out.println(reverse(str));
	}
}
