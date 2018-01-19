package com.stringquestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadFileDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("dk.txt"));
		Map<String, Integer> map = new HashMap<>();
		String[] words;
		String string = bf.readLine();
		while (string != null) {
			words = string.split(" ");
			for (String word : words) {
				if (map.containsKey(word)) {
					map.put(word, (map.get(word) + 1));
				} else {
					map.put(word, 1);
				}
			}
			string = bf.readLine();
		}
		System.out.println(map);
	}
}
