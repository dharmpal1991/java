package com.java.datastructure;

class BinaryTree{
	private int data;
	private BinaryTree left;
	private BinaryTree right;
	
	public BinaryTree(int num){
		this.data = num;
		this.left = null;
		this.right = null;
	}
	public void addNode(int num){
		if(num < this.data){
			if(this.left != null){
				this.left.addNode(num);
			}
			else{
				this.left = new BinaryTree(num);
			}
		}
		else{
			if(this.right != null){
				this.right.addNode(num);
			}
			else{
				this.right = new BinaryTree(num);
			}
		}
	}
	public void traversePreOrder(){
		System.out.println(this.data+" ");
		if(this.left!= null){
			this.left.traversePreOrder();
		}
		if(this.right!= null){
			this.right.traversePreOrder();
		}
	}
	public void traverseInOrder(){
		if(this.left!=null){
			this.left.traverseInOrder();
		}
		System.out.print(this.data+" ");
		if(this.right!= null){
			this.right.traverseInOrder();
		}
	}
	public void traversePostOrder(){
		if(this.left!=null){
			this.left.traversePostOrder();
		}
		if(this.right!=null){
			this.right.traversePostOrder();
		}
		System.out.println(this.data+" ");
	}
}

public class TreeDemo {
	public static void main(String[] args) {
		BinaryTree b = new BinaryTree(25);
		int [] num = {25,15,50,10,22,35,70,4,12,18,24,31,44,66,90};
		for(int i :num){
			b.addNode(i);
		}
		b.traversePreOrder();
		b.traverseInOrder();
		b.traversePostOrder();
	}
}
