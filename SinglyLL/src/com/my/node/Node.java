package com.my.node;

public class Node {
	private int data;
	private Node next;
	public Node() {
		super();
		this.data = 0;
		this.next = null;
	}


	public Node(int data) {
		super();
		this.data = data;
	
	}

	
	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
