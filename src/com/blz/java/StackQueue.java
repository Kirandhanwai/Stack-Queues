package com.blz.java;

public class StackQueue {
	static LinkedList list = new LinkedList();

	public void push(Object data) {
		list.addFirst(data);
	}

	public void pop() {
		list.deleteFirst();
	}

	public void show() {
		list.display();
	}
}
