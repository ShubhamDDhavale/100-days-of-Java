package com.my.queueInterface;

import com.my.QueueExceptions.QueueIsEmptyException;
import com.my.QueueExceptions.QueueIsFullException;

public interface QueueInterface<T> {
	public boolean isEmpty();

	public void printQueue(T data);

	public void addlast(T data) throws QueueIsFullException;

	public T removeFirst() throws QueueIsEmptyException;

	public boolean isFull();

}
