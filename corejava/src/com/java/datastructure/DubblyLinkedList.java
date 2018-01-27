package com.java.datastructure;

class Link{
	private int data;
	public Link next;
	public Link previous;
	
	public Link(int data){
		previous = null;
		this.data = data;
		next = null;
	}
	public Link(Link prevoius,int data,Link next){
		this.previous = prevoius;
		this.data = data;
		this.next = next;
	}
	public int Data(){
		return data;
	}
}
public class DubblyLinkedList {
	private Link head;
	private int size;
	
	public DubblyLinkedList(){
		head = null;
		size = 0;
	}
	public boolean isEmpty(){
		return head == null;
	}
	public int size(){
		return size;
	}
	public void addFront(int data){
		if(head == null){
			head = new Link(null, data, null);
		}
		else{
			Link newLink = new Link(null, data, head);
			head.previous = newLink;
			head = newLink;
		}
		size++;
	}
	public void addRear(int data){
		if(head == null){
			head = new Link(null, data, null);
		}
		else{
			Link current = head;
			while(current.next !=null){
				current =current.next;
			}
			Link newLink = new Link(current, data, null);
			current.next = newLink;
		}
		size++;
	}
	public void removeFront(){
		if(head == null) return;
		
		head = head.next;
		head.previous = null;
		size--;
	}
	public void removeRear(){
		if(head == null) return;
		if(head.next == null){
			head = null;
			size--;
			return;
		}
		Link current = head;
		while(current.next.next !=null){
			current = current.next;
		}
		current.next = null;
		size--;
	}
	public void insertAt(int data,int index){
		if(head == null) return;
		if(index<0 ||index>size) return;
		
		Link current = head;
		int i=1;
		while(i<index){
			current = current.next;
			i++;
		}
		if(current.previous == null){
			Link newLink = new Link(null, data, current);
			current.previous = newLink;
			head = newLink;
		}
		else{
			Link newLink = new Link(current.previous, data,current);
			current.previous.next = newLink;
			current.previous = newLink;
		}
		size++;
	}
	public void removeAt(int index){
		if(head == null) return;
		if(index<0 || index>size) return;
		
		Link current = head;
		int i =1;
		while(i<index){
			current = current.next;
			i++;
		}
		if(current.next == null){
			current.previous.next = null;
		}
		else if(current.previous == null){
			current = current.next;
			current.previous = null;
			head = current;
		}
		else{
			current.previous.next = current.next;
			current.next.previous = current.previous;
		}
		size--;
	}
	public void print(){
		Link current = head;
		while(current != null){
			System.out.println(current.Data());
			current = current.next;
		}
	}
	public static void main(String[] args) {
		DubblyLinkedList dll = new DubblyLinkedList();
		dll.addFront(10);
		dll.addFront(20);
		dll.addFront(30);
		dll.print();
		System.out.println("---");
		dll.addRear(40);
		dll.addRear(50);
		dll.print();
		System.out.println("---");
		dll.removeFront();
		dll.print();
		System.out.println("---");
		dll.removeRear();
		dll.print();
		System.out.println("---");
		dll.insertAt(50, 2);
		dll.insertAt(100, 3);
		dll.print();
		System.out.println("---");
		dll.removeAt(2);
		dll.print();
	}
}
