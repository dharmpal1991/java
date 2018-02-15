package com.java2blogprogram;

import java.util.HashMap;

public class FindDuplicateInString {
	public static void main(String[] args) {
		String s = "dharmpal kansujia";
		HashMap<Character,Integer> map = new HashMap<>();
		char [] ch = s.toCharArray();
		for(char c :ch){
			if(Character.isAlphabetic(c)){
				if(map.containsKey(c)){
					map.put(c, map.get(c)+1);
				}
				else{
					map.put(c, 1);
				}
			}
		}
		System.err.println(map);
	}

}
