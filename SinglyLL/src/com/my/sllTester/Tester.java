package com.my.sllTester;

import com.my.sll.SinglyLinkedList;
import com.my.sllExceprtion.NoSuchElementFoundException;

public class Tester {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		System.out.println("added first");
		list.addAtFirst(5);
		list.addAtFirst(6);
		list.addAtFirst(7);
		list.addAtFirst(8);
		
		list.show();
		System.out.println("adding last");
		list.addAtLast(10);
		list.addAtLast(15);
		list.show();
		System.out.println("adding after 8 ");
		list.addAfter(8, 9);
		list.show();
		System.out.println("deleting head 8");
		
		try {
			list.delete(8);
			list.show();
			
			System.out.println("deleting tail 15");
			list.delete(15);
			list.show();
			System.out.println("deleting 7");
			list.delete(7);
			list.show();
			System.out.println("deleting head 9");
			list.delete(9);
			list.show();
			System.out.println("deleting tail 10");
			list.delete(10);
			list.show();
			list.delete(58);
		} catch (NoSuchElementFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
