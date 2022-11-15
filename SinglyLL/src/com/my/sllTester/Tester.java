package com.my.sllTester;

import com.my.sll.SinglyLinkedList;

public class Tester {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addAtFirst(5);
		list.addAtFirst(6);
		list.addAtFirst(7);
		list.addAtFirst(8);
		list.addAtLast(10);
		list.addAtLast(15);
		list.addAfter(8, 9);
		list.show();
		
	}

}
