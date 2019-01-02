package com.vectorTest;

import java.util.List;
import java.util.Stack;

public class VectorMain {

	public static void main(String[] args) {
		List<Object> list = new Stack<>();

		// adding element into arrayList
		list.add("One");
		list.add("Three");
		list.add("Four");
		list.add("Six");
		list.add("Five");
		list.add("Two");

		// adding duplicate element - allowed
		list.add("Six");

		// adding null element - allowed
		list.add(null);
		list.add(null);

		// checking ordering - insertion
		list.iterator().forEachRemaining(l -> {
			System.out.print(l + ", ");
		});
		System.out.println();

	}

}
