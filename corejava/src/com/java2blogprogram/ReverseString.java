package com.java2blogprogram;

public class ReverseString {
	
	public static String reverseString1(String str){
		if((str == null) ||(str.length()<=1)){
			return str;
		}
		return reverseString1(str.substring(1))+str.charAt(0);
	}
	public static void reverseString2(String str){
		String reverse = "";
		for(int i= str.length()-1;i>=0;i--){
			reverse = reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}
	public static void reverseString3(String str){
		char[] ch = str.toCharArray();
		for(int i=0,j=ch.length-1;i<j;i++,j--){
			int temp = ch[i];
			ch[i] = ch[j];
			ch[j] = (char)temp;
		}
		System.out.println(new String(ch));
	}
	public static void reverseString4(String str){
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb = sb.reverse();
		System.out.println(sb);
	}
	
	
	public static void main(String[] args) {
		String s = "dharmpal kansujia";
		System.out.println(reverseString1(s));
		reverseString2(s);
		reverseString3(s);
		reverseString4(s);
	}

}
