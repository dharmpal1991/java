package com.java.datastructure;

import java.util.Arrays;

public class SelectionSort {
	public static int[] selectioSorting(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
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
		System.out.println(Arrays.toString(selectioSorting(arr)));
	}
}
