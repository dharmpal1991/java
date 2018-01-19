package com.stringquestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class ReadFileDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		Map<String, Integer>map = new HashMap<>();
		@SuppressWarnings("resource")
		BufferedReader bf = new BufferedReader(new FileReader("dk.txt"));
		String string = bf.readLine();
		while(string !=null){
			StringTokenizer st = new StringTokenizer(string, " ");
			while(st.hasMoreTokens()){
				String temp = st.nextToken().toLowerCase();
				if(map.containsKey(temp)){
					map.put(temp, map.get(temp)+1);
				}
				else
					map.put(temp, 1);
			}
			string = bf.readLine();
			Set s = map.entrySet();
			Iterator it = s.iterator();
			while(it.hasNext()){
				Map.Entry<String, Integer> entry = (Entry<String, Integer>) it.next();
				System.out.println(entry.getKey()+"\t"+entry.getValue());
			}
		}
		
	}

}
