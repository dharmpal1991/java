package com.oops;

public class Test {
	void method1(Object o){
		System.out.println("object");
	}
	 void method1(String s){
		System.out.println("String");
	}
	 void method1(Integer i){
		System.out.println("Integer");
	}
	 void method1(int i){
		System.out.println("int");
	}
	 public static void main(String[] args) {
		Test t = new Test();
		t.method1(10);
	}
}
