package com.java;

public class Solution6 {
	public static int difference(String[]pro,double[]price,String[]pro1,double[]price1){
		int count = -1;
		for(int i=0;i<pro.length-1;i++){
			for(int j=0;j<pro1.length-1;j++){
				if(pro[i]==pro1[j]){
					for(int k=0;k<price.length-1;k++){
						for(int l=0;l<price1.length-1;l++){
							if(price[k] !=price1[l]){
								count++;
								break;
							}
						}
					}
				}
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		String[]pro ={"banana","mango","apple","ghee"};
		double[]price={12.50,24.45,12.60,450.50};
		String[]pro1={"mango","ghee"};
		double[]price1={25.67,500.54};
		int c = difference(pro, price, pro1, price1);
		System.out.println(c);
	}
}
