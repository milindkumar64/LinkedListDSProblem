package com.bridgelabz;

import java.util.*;

class LinkedListProblem {

	public static void main(String[] args) {

		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
			
		linkedlist.add(56);
		linkedlist.add(70);
		linkedlist.add(1, 30);
		
		System.out.println(linkedlist);
	 
		linkedlist.remove();
        
		System.out.println("First element has been removed:");
		System.out.println(linkedlist);
		
	}
}