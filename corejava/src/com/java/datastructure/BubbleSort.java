package com.java.datastructure;

import java.util.Arrays;

public class BubbleSort {
	public static int[] bubbleSorting(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j+1);
				}
			}
		}
		return arr;
	}
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		int[] arr = { 10, 34, 56, 7, 3, 67, 2, 32, 12 };
		System.out.println(Arrays.toString(bubbleSorting(arr)));
	}
}
