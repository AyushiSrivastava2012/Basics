package com.basic.linkedList;

public class MainClass {

	public static void main(String [] args){
		Node first = new Node(3);
		Node second = new Node(4);
		Node third = new Node(5);
		//create a list
		LinkedList list = new LinkedList();
		first.setNext(second);
		second.setNext(third);
		third.setPrevious(second);
		second.setPrevious(first);		
		list.setHead(first);
		list.setLast(third);

		//add new node at head
		Node newfirst = new Node(10);
		newfirst.setNext(list.getHead());
		list.getHead().setPrevious(newfirst);
		list.setHead(newfirst);

		//print list
		list.printForward();
		System.out.println("now backwards");
		list.printBackward();

		//get its size
		int i= list.getCount();
		System.out.println(i);

		//search for an element
		int position = list.searchForKeyIterative(8);
		System.out.println(position);

		//search for an element
		position = list.searchForKeyRecursive(10,0,list.getHead());
		System.out.println(position);
		
		//swap nodes
		Node tmp = list.getHead().getNext();
		list.getHead().setNext(tmp.getNext());
		tmp.setNext(list.getHead().getNext().getNext());
		list.getHead().getNext().setNext(tmp);
		list.printForward();
		
		//reverse the list
		list.setHead(list.reverse(list.getHead()));
		list.printForward();
	}
}
