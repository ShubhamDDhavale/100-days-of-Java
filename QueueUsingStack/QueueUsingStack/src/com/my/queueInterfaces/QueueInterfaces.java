package com.my.queueInterfaces;

import com.my.queueException.QueueIsEmptyException;

public interface QueueInterfaces<T> {
	public void addQ(T data);
	public T deleteQ() throws QueueIsEmptyException;
	public void show();
}
