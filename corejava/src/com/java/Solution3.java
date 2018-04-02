package com.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		double d = sc.nextDouble();
		
		NumberFormat nf1 = NumberFormat.getInstance(Locale.ITALY);
		System.out.println(nf1.format(d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CANADA);
		System.out.println(nf2.format(d));
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf3.format(d));
		
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
		System.out.println(nf4.format(d));
	}
}
