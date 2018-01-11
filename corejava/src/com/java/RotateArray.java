package com.java;

public class RotateArray {
	
	private static void rotateMethod(int [] arr,int position,int len){
		for(int i=0;i<position;i++)
			rotate(arr,len);
	}
	private static void rotate(int[]arr,int len){
		int temp = arr[0];
		int i;
		for(i=0;i<len-1;i++)
			arr[i]=arr[i+1];
			arr[i]= temp;
	}
	private static void print(int[]arr,int len){
		for(int array : arr){
			System.out.print(array +" ");
		}
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8,9,10};
		int len = arr.length;
		int position = 5;
		rotateMethod(arr, position, len);
		print(arr, len);
	}

}
