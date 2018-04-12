package com.oops;


			/*Enter a number:
			4
			44444
			44144
			44244
			44344
			44444*/

import java.util.Scanner;

public class Pattern1 {
	
	public static void pattern(int n){
		int k=1;
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
				if((i==0)||(i==n)||j!=2){
					System.out.print(n);
				}
				else{
					System.out.print(k);
					k++;
				}
			}
			System.out.println();
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		pattern(n);
	}

}
