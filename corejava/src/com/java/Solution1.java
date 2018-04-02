package com.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();

	        // Write your code here.
	        Locale INDIA=new Locale("pa","IN");
	        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.UK);
	        NumberFormat nf2 = NumberFormat.getCurrencyInstance(INDIA);
	        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        
	        System.out.println("US: " + nf1.format(payment));
	        System.out.println("India: " + nf2.format(payment));
	        System.out.println("China: " + nf3.format(payment));
	        System.out.println("France: " + nf4.format(payment));
		}

}
