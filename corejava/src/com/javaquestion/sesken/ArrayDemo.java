package com.javaquestion.sesken;

public class ArrayDemo {
	public static void array(int arr[], char[] ch) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

			for (int j = i; j <= i;j++) {
				System.out.println();
			}
			
		}
	}
	public static void main(String[] args) {
		int array_1[] = { 1, 2, 3, 4, 5, 6, 7 };
		char array_2[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		array(array_1, array_2);
	}
}
