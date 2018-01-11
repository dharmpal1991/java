package com.java;

final class ImmutableDemo1 {
	private int i;
	public ImmutableDemo1(int i) {
		this.i =i;
	}
	public ImmutableDemo1 modify(int i){
		if(this.i ==i)
			return this;
		else
			return (new ImmutableDemo1(i));
	}
	public static void main(String[] args) {
		ImmutableDemo1 c1 = new ImmutableDemo1(10);
		System.out.println(c1);
		ImmutableDemo1 c2 = c1.modify(20);
		System.out.println(c2);
		ImmutableDemo1 c3 = c1.modify(10);
		System.out.println(c3);
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
		
	}
	@Override
	public String toString() {
		return "ImmutableDemo1 [i=" + i + "]";
	}
}
