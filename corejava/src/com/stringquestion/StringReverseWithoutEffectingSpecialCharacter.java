package com.stringquestion;

public class StringReverseWithoutEffectingSpecialCharacter {
	public static String reverseString(String str){
		char [] charArray = str.toCharArray();
		int l = 0;
		int i = charArray.length-1;
		while(l<i){
			if(!Character.isAlphabetic(charArray[l])){
			l++;
			}
			else if(!Character.isAlphabetic(charArray[i])){
				i--;
			}
			else{
				char temp = charArray[l];
				charArray[l]= charArray[i];
				charArray[i] = temp;
				l++;
				i--;
			}
		}
		return new String(charArray);
	}
	public static void main(String[] args) {
		String str = "abc$d@e%f&!eretreb#df";
	//	String str = "a,b$c";
		System.out.println(reverseString(str));
	}

}
