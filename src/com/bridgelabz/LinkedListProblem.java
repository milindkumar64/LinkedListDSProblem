package com.bridgelabz;

import java.util.*;

class LinkedListProblem {
	
	void pop(LinkedList<Integer> linkedlist)
	{
		linkedlist.pop( );
	}


	public static void main(String[] args) {

		LinkedListProblem linkedlistproblem = new LinkedListProblem();
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
			
		linkedlist.add(56);
		linkedlist.add(70);
		linkedlist.add(1, 30);
		
		System.out.println(linkedlist);
		
		linkedlistproblem.pop(linkedlist);
		
		System.out.println("First element has been removed:");
		System.out.println(linkedlist);
		
	}
}