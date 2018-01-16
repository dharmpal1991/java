package com.oops;

class Parent{
	public void methodOne(){
		System.out.println("parent");
	}
}
public class Child  extends Parent{
	public void methodTwo(){
		System.out.println("child");
	}
	public static void main(String[] args) {
		Parent p = new Parent();
		p.methodOne();
		Child c = new Child();
		c.methodOne();
		c.methodTwo();
		Parent p1 = new Child();
		p1.methodOne();
	}

}
