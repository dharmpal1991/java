package com.java.string;

final class Immutable {
	private int i;
	Immutable(int i) {
		this.i = i;
	}
	public Immutable modify(int i){
		if(this.i == i)
			return this;
		else
			return (new Immutable(i));
	} 
	public static void main(String[] args) {
		Immutable c1 = new Immutable(10);
		Immutable c2 = c1.modify(100);
		Immutable c3 = c1.modify(10);
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
		Immutable c4 = c1.modify(10);
		System.out.println(c3 == c4);
	}
}
