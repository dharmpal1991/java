package com.java2blogprogram;

public class NonRepatedCharacter {
	public static Character nonRepatedCharacter(String str){
		char [] ch = str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(str.lastIndexOf(ch[i]) == str.indexOf(ch[i])){
				return ch[i];
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		String s = "dharmpal";
		System.out.println(nonRepatedCharacter(s));
	}

}
