package com.bridgelabz;

import java.util.*;

class SortedLinkedListProblem {

	private void addValue(LinkedList<Integer> linkedlist, int val) {

		if (linkedlist.size() == 0) {
			linkedlist.add(val);
		} else if (linkedlist.get(0) > val) {
			linkedlist.add(0, val);
		} else if (linkedlist.get(linkedlist.size() - 1) < val) {
			linkedlist.add(linkedlist.size(), val);
		} else {
			int i = 0;
			while (linkedlist.get(i) < val) {
				i++;
			}
			linkedlist.add(i, val);
		}
	}

	public static void main(String[] args) {

		SortedLinkedListProblem linkedlistproblem = new SortedLinkedListProblem();

		LinkedList<Integer> linkedlist = new LinkedList<Integer>();

		System.out.println("Enter the value to add :");
		Scanner sc = new Scanner(System.in);

		int check = 1;
		while (check == 1) {
			int val = sc.nextInt();
			linkedlistproblem.addValue(linkedlist, val);
			System.out.println("Want to add more put '1' else anykey: ");
			check = sc.nextInt();
		}
		System.out.println(linkedlist);

	}
}