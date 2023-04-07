package com.bridgelabz;

import java.util.*;

class LinkedListProblem {

	public static void main(String[] args) {

		LinkedListProblem linkedlistproblem = new LinkedListProblem();

		LinkedList<Integer> linkedlist = new LinkedList<Integer>();

		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(70);


		Iterator itr = linkedlist.iterator();
		while(itr.hasNext())
		{
			Integer i = (Integer)itr.next();
			if(i==30)
		    System.out.println("Got the Node with value 30");
		}
		System.out.println(linkedlist);

	}
}