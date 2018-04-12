package com.oops;

		/*
		3
		44
		555
		6666
		6666
		555
		44
		3*/

public class Pattern2 {
	public static void main(String[] args) {
		int n = 4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+2);
			}
			System.out.println();
		}
		for(int i=n;i>=0;i--){
			for(int k=1;k<=i;k++){
				System.out.print(i+2);
			}
			System.out.println();
		}
	}
}
