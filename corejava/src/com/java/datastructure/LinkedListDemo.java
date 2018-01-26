package com.java.datastructure;

class Node{
	public int data;
	public Node next;
	
	public void displayNodeData(){
		System.out.println("{"+data+"}");
	}
}
 class SingleLinkedList{
	private Node head;
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	public void addFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	public Node deleteFirst(){
		Node temp = head;
		head = head.next;
		return temp;
	}
	public void deleteAfter(Node after){
		Node temp = head;
		while(temp.next != null && temp.data != after.data){
			temp = temp.next;
		}
		if(temp.next != null){
			temp.next = temp.next.next;
		}
	}
	public void InsertLast(int data){
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = newNode;
	}
	public void printLinkedList(){
		Node current = head;
		while(current !=null){
			current.displayNodeData();
			current = current.next;
		}
		System.out.println( );
	}
}
 
public class LinkedListDemo {
	public static void main(String[] args) {
		SingleLinkedList l = new SingleLinkedList();
		l.addFirst(10);
		l.addFirst(50);
		l.addFirst(30);
		l.addFirst(60);
		l.addFirst(90);
		l.printLinkedList();
		Node node = new Node();
		node.data = 1;
		l.deleteAfter(node);
		l.printLinkedList();
		l.deleteFirst();
		l.printLinkedList();
		l.InsertLast(100);
		l.printLinkedList();
	}

}
