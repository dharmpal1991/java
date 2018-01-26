package com.javaquestion.sesken;

class Runnable1 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			if(i%2 ==0){
				System.out.println("Even Number:"+i);
			}
		}
	}
}
class Runnable2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			if(i%2 !=0){
				System.out.println("Odd Number:"+i);
			}
		}	
	}
}
public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Runnable r = new Runnable1();
		Thread t = new Thread(r);
		t.start();
		Runnable r1 = new Runnable2();
		Thread t1 = new Thread(r1);
		t1.start();
		t.join();
	}		
}
