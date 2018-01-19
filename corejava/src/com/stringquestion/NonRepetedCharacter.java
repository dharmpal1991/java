package com.stringquestion;

public class NonRepetedCharacter {
	public static void nonRepetedChar(String str) {
		for (char ch : str.toCharArray()) {
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}
	}
	public static void nonRepetedChar1(String str){
		for(int i=0;i<str.length();i++){
			boolean flag = true;
			for(int j=0;j<str.length();j++){
				if(i!=j && str.charAt(i)==str.charAt(j)){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println(str.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		String s = "ffeeddbbaaclck";
		nonRepetedChar(s);
		nonRepetedChar1(s);
	}

}
