package com.java;

public  class SingletonDemo {
	private static SingletonDemo t = null;
	private SingletonDemo(){
	}
	public static SingletonDemo getTest(){
		if(t == null){
			t = new SingletonDemo();
		}
		return t;
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		SingletonDemo s = new SingletonDemo();
		System.out.println(s.getTest().hashCode());
		System.out.println(s.getTest().hashCode());
		System.out.println(s.getTest().hashCode());
		System.out.println(s.getTest().hashCode());
		
	}

}
