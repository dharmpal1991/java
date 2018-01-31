package com.java;

public class Demo {
	public static void main(String[] args) {
		final int x =9;
		int [][] a = {{5,4,1},{9,5,6},{4,6,8}};
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(a[i][j] == x) break;
				System.out.print(a[i][j]+" ");
			}
			
		}
	}

}
