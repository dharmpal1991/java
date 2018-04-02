package com.java;

import java.util.Locale;

public class Solution2 {
	public static void main(String[] args) {
		Locale l1 = Locale.getDefault();
		System.out.println(l1.getCountry() + "-----" + l1.getLanguage());
		System.out.println(l1.getDisplayCountry() + "-----" + l1.getDisplayLanguage());
		Locale l2 = new Locale("pa", "IN");
		Locale.setDefault(l2);
		String[] s1 = Locale.getISOLanguages();
		for (String s : s1) {
			System.out.println(s + " ");
		}
		String[] s2 = Locale.getISOCountries();
		for (String str : s2) {
			System.out.print(str + " ");
		}
		Locale[] loc = Locale.getAvailableLocales();
		for (Locale l : loc) {
			System.out.println(l.getDisplayCountry() + "-----" + l.getDisplayLanguage());
		}
	}

}
