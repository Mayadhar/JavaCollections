package com.linkedListTest;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		// adding element into arrayList
		list.add("Two");
		list.add("One");
		list.add("Four");
		list.add("Six");
		list.add("Five");
		list.add("Three");

		// adding null element - allowed
		list.add(null);
		list.add(null);

		// adding duplicate element - allowed
		list.add("Six");

		// checking ordering - insertion
		list.iterator().forEachRemaining(l -> {
			System.out.print(l + ", ");
		});
		System.out.println();

	}

}
