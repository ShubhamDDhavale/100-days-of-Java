package com.my.sll;

import com.my.node.Node;
import com.my.sllExceprtion.NoSuchElementFoundException;

public class SinglyLinkedList implements SinglyLLInterface {
	private Node head;
	private Node tail;
	private Node current;
	
	@Override
	public void addAtFirst(int data) {
		Node newNode = new Node(data);

		if(head== null) {
			head= newNode;
			tail= newNode;
			newNode.setNext(null);
			}
		else {
			newNode.setNext(head);
			head= newNode;
		}
	}

	@Override
	public void addAtLast(int data) {
		Node newNode = new Node(data);

		if(head== null) {
			head= newNode;
			tail= newNode;
			newNode.setNext(null);
			}
		else {
			tail.setNext(newNode);
			tail= newNode;
		}
	}

	@Override
	public void addAfter(int element, int data) {
		Node newNode = new Node(data);

		if(element== tail.getData()) {
			tail.setNext(newNode);
			tail= newNode;
			newNode.setNext(null);
			return;
			}
		else {
			Node current= head ;
			while(current!= null) {
				if(current.getData()==element) {
					newNode.setNext(current.getNext());
					current.setNext(newNode);
					return;
				}
				current= current.getNext();
			}
			System.out.println(" Element not found!!");
		}
	}

	@Override
	public void show() {
		Node current= head ;
		while(current!= null) { 
			System.out.println(current.getData());
			current=current.getNext();
		}
	}

	@Override
	public Node delete(int data) throws NoSuchElementFoundException {
		Node deleted=null;
		Node current= head ;
		Node previous= null;
		if(head.getData()== data) {
			deleted= head;
			head= head.getNext();
			return deleted;
		}
		while(current!= null) {
			if (current.getData()== data) {
				if (current== tail) {
					deleted= current;
					tail= previous;
					tail.setNext(null);
					break;
				}
				deleted= current;
				previous.setNext(current.getNext());
			}
			previous = current;
			current = current.getNext();
		}
		if(deleted== null) {
			throw new NoSuchElementFoundException("This elemnt is not found in the obove list");
		}
		return deleted;
	}
}
