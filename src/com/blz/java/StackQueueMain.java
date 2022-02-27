package com.blz.java;

public class StackQueueMain {
	public static void main(String[] args) {
		System.out.println("Stack and Queue Practice Problems");
		// static LinkedList list = new LinkedList();
		StackQueue sq = new StackQueue();
		sq.push(70);
		sq.push(30);
		sq.push(56);
		sq.show();
		sq.pop();
		sq.show();
	}
}
