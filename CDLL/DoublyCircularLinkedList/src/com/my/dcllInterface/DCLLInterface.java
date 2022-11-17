package com.my.dcllInterface;

import com.my.dcllException.ElementNotFoundException;

public interface DCLLInterface<T> {
	public void addFirst (T data);
	public void addLast (T data);
	public void addAfter (T element ,T data);
	public T deleteFirst();
	public T deleteLast();
	public T delete(T data) throws ElementNotFoundException;
	public void show();

}
