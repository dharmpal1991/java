package com.java;

public class RestrictObjectCreation {
	private static RestrictObjectCreation object;
	public static int objCount =0;
	private RestrictObjectCreation(){
		objCount ++;
	}
	public static RestrictObjectCreation getInstance(){
		if(objCount < 3){
			object = new RestrictObjectCreation();
		}
		return object;
	}
	public static void main(String[] args) {
		RestrictObjectCreation r1 =  RestrictObjectCreation.getInstance();
		RestrictObjectCreation r2 =  RestrictObjectCreation.getInstance();
		RestrictObjectCreation r3 =  RestrictObjectCreation.getInstance();
		RestrictObjectCreation r4 =  RestrictObjectCreation.getInstance();
		RestrictObjectCreation r5 =  RestrictObjectCreation.getInstance();
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(r3.hashCode());
		System.out.println(r4.hashCode());
		System.out.println(r5.hashCode());
	}
}
