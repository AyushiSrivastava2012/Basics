package com.basic.linkedList;

class Node {

	private Node previous;
	private Node next;
	private int data;

	public  Node(){

	}

	@Override
	public String toString() {
		return "Node [previous= , next=, data=" + data + "]";
	}

	public  Node(int val){
		this.data = val;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
	
}