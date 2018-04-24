package com.java.string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void removeDuplicateInString(String str){
		String [] s = str.split(" ");
		Set<String> set = new LinkedHashSet<>(Arrays.asList(s));
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String string = it.next();
			System.out.print(string+" ");
		}
	}
	public static void main(String[] args) {
		String s = "This is a book but not a noval its only book";
		removeDuplicateInString(s);
	}

}
