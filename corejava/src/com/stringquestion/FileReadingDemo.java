package com.stringquestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileReadingDemo {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		BufferedReader bf = new BufferedReader(new FileReader("dk.txt"));
	//	TreeMap<String, Integer> map = new TreeMap<>();
	//	Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map = new LinkedHashMap<>();
		String []words;
		String line = bf.readLine();
		while(line != null){
			words = line.split(" ");
			for(String word :words){
				if(map.containsKey(word)){
					map.put(word, (map.get(word)+1));
				}
				else{
					map.put(word, 1);
				}
			}
			line = bf.readLine();
		}
		System.out.print(map);
	}
}
