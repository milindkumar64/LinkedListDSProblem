package com.bridgelabz;

import java.util.*;

class LinkedListProblem {

	void popLast(LinkedList<Integer> linkedlist) {
		linkedlist.pollLast();
	}

	public static void main(String[] args) {

		LinkedListProblem linkedlistproblem = new LinkedListProblem();

		LinkedList<Integer> linkedlist = new LinkedList<Integer>();

		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(70);

		System.out.println(linkedlist);

		linkedlistproblem.popLast(linkedlist);

		System.out.println("First element has been removed:");
		System.out.println(linkedlist);

	}
}