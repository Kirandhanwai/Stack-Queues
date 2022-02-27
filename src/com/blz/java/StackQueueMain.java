package com.blz.java;

public class StackQueueMain {
	public static void main(String[] args) {
		System.out.println("Stack and Queue Practice Problems");
		// static LinkedList list = new LinkedList();
		StackQueue sq = new StackQueue();
		sq.enqueue(56);
		sq.enqueue(30);
		sq.enqueue(70);
		sq.show();
	}
}
