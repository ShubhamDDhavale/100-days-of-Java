package com.my.dcllTester;

import com.my.dcllException.ElementNotFoundException;
import com.my.dcllInterface.DCLLImpl;

public class Tester {

	public static void main(String[] args) {
		DCLLImpl<Integer> list = new DCLLImpl();
		
		list.addFirst(15);
		list.addFirst(20);
		list.addFirst(25);
		list.addFirst(30);
		list.addFirst(35);
		list.addFirst(40);
		list.show();
		list.addLast(10);
		list.addLast(5);
		list.show();
		System.out.println();
		list.addAfter(5, 7);
		list.addAfter(15, 17);
		list.addAfter(40, 42);
		list.show();
		System.out.println(" deleting Last");
		list.deleteLast();
		System.out.println(" deleting Last");
		list.deleteLast();
		list.show();
		System.out.println();
		System.out.println(" deleting First");
		list.deleteFirst();	
		System.out.println(" deleting First");
		list.deleteFirst();
		list.show();
		System.out.println();
		
		
		try {
			list.delete(30);
		} catch (ElementNotFoundException e) {
			e.getMessage();
		}
		list.show();
	}

}
