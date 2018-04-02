package com.java;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution4 {
	public static void main(String[] args) {
		System.out.println("Full:-"+DateFormat.getDateInstance(0).format(new Date()));
		System.out.println("long:-"+DateFormat.getDateInstance(1).format(new Date()));
		System.out.println("Mediam:-"+DateFormat.getDateInstance(2).format(new Date()));
		System.out.println("short:-"+DateFormat.getDateInstance(3).format(new Date()));
		
		DateFormat us = DateFormat.getDateInstance(0, Locale.US);
		System.out.println(us.format(new Date()));
		
		DateFormat it = DateFormat.getDateInstance(0,Locale.ITALY);
		System.out.println(it.format(new Date()));
		
		DateFormat china = DateFormat.getDateInstance(0,Locale.CHINA);
		System.out.println(china.format(new Date()));
		
		DateFormat itily = DateFormat.getDateTimeInstance(0,0,Locale.ITALY);
		System.out.println(itily.format(new Date()));
		
		DateFormat korean = DateFormat.getDateTimeInstance(0,0,Locale.KOREAN);
		System.out.println(korean.format(new Date()));
		
	}
}
