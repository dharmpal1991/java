package com.java.string;

public class ReverseString {
	public static void reverse(String str){
		char[] ch = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	public static void reverse1(String str){
		String s ="";
		for(int i=str.length()-1;i>=0;i--){
			s = s+str.charAt(i);
		}
		System.out.println(s);
	}
	public static void reverse2(String str){
		byte[] b = str.getBytes();
		for(int i=0,j=b.length-1;i<j;i++,j--){
			byte temp = b[i];
			b[i] = b[j];
			b[j] = temp;
		}
		System.out.println(new String(b));
	}
	public static void reverse3(String str){
		StringBuffer buffer = new StringBuffer();
		buffer.append(str);
		buffer = buffer.reverse();
		System.out.println(buffer);
	}
	
	public static String reverse4(String str){
		if((str.length() < 1) ||( str == null))
			return str;
		return reverse4(str.substring(1))+str.charAt(0);
	}
	
	public static void main(String[] args) {
		String str = "dharmpal kansujia";
		reverse(str);
		reverse1(str);
		reverse2(str);
		reverse3(str);
		System.out.println(reverse4(str));
	}

}
