package com.bridgelabz;

import java.util.*;

class LinkedListProblem {

	public static void main(String[] args) {

		LinkedListProblem linkedlistproblem = new LinkedListProblem();

		LinkedList<Integer> linkedlist = new LinkedList<Integer>();

		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(40);
		linkedlist.add(70);

		System.out.println(linkedlist);

		ListIterator itr = linkedlist.listIterator();

		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if (i == 40) {
				itr.remove();
				System.out.println("Node 40 has been deleted From LinkedList");
			}
		}
		System.out.println(linkedlist);
		System.out.println("Existing LinkedList size is :"+linkedlist.size());

	}
}