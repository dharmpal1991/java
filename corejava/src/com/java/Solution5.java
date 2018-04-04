package com.java;

public class Solution5 {
	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if((i==1)||(i==5)||j!=3){
					System.out.print("4");
				}
				else{
					System.out.print(k);
					k++;
				}
			}
			System.out.println();
		}
	}

}
