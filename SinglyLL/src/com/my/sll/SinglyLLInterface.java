package com.my.sll;

import com.my.node.Node;
import com.my.sllExceprtion.NoSuchElementFoundException;

public interface SinglyLLInterface {
public void addAtFirst(int data);
public void addAtLast(int data);
public void addAfter(int elment, int data);
public void show();
public Node delete(int data) throws NoSuchElementFoundException;

}
