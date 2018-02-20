package com.basic.linkedList;

public class LinkedList {




	Node head;
	Node last;// in case of doubly linkedlist



	public void printForward() {
		Node n = this.getHead();
		while(n.getNext() != null){
			System.out.print(n.getData()+" ");
			n=n.getNext();
		}
		System.out.println(n.getData());
	}

	public void printBackward() {
		Node n = this.getLast();
		while(n.getPrevious() != null){
			System.out.print(n.getData()+" ");
			n=n.getPrevious();
		}
		System.out.println(n.getData());
	}


	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getCount() {
		//print length of list
		Node tmp = this.getHead();
		int i=0;
		while(tmp != null){
			i++;
			tmp = tmp.getNext();
		}
		return i;
	}

	public int searchForKeyIterative(int i) {
		Node tmp = this.getHead();
		int pos =0;
		while(tmp != null){
			pos++;
			if(tmp.getData() == i)
				return pos;
			
			tmp = tmp.getNext();
		}
		return -1;
	}

	public int searchForKeyRecursive(int i,int pos,Node node) {
		pos++;
		if(node.getData() == i)
			return pos;
		else if(node.getNext() != null){
			return searchForKeyRecursive(i,pos,node.getNext());
		}
		//not found
		return -1;
	}

	public Node reverse(Node node) {
//		Node tmp = this.head;
//		while(tmp != null ){
//			Node pos = tmp.getNext();
//			if(tmp.getNext() == null){
//				//last node
//				this.head = tmp;
//				pos.setPrevious(tmp.getPrevious());
//			}
//			else{
//				pos.setPrevious(pos);
//			}
//			tmp.setNext(tmp.getPrevious());
//			
//			tmp = pos;
//			
//		}
//		
		Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);//next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
	}

}
