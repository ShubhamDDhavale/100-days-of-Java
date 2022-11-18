package com.my.queueTester;

import com.my.queue.Queue;
import com.my.queueException.QueueIsEmptyException;

public class Tester {

	public static void main(String[] args) {
		Queue newQ = new Queue<Integer>();
		newQ.addQ(50);
		newQ.addQ(60);
		newQ.addQ(70);
		newQ.addQ(40);
		newQ.show();
		try {
			newQ.deleteQ();
			newQ.show();
			newQ.deleteQ();
			newQ.deleteQ();
			newQ.deleteQ();
			newQ.show();
			newQ.deleteQ();
			newQ.deleteQ();
			
		} catch (QueueIsEmptyException e) {
			System.out.println(e.getMessage());
		}
		

	}

}