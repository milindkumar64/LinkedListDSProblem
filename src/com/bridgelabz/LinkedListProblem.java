package com.bridgelabz;

import java.util.*;

class LinkedListProblem {

	public static void main(String[] args) {

		LinkedListProblem linkedlistproblem = new LinkedListProblem();

		LinkedList<Integer> linkedlist = new LinkedList<Integer>();

		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(70);
		
		System.out.println(linkedlist);

		ListIterator itr = linkedlist.listIterator();
		
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if (i == 30)
				{itr.add(40);
				System.out.println("Got the Node with value 30 and adding Next Node 40");
				}
		}
		System.out.println(linkedlist);

	}
}