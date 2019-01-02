package com.vectorTest;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();

		// adding element into set
		set.add("One");
		set.add("Three");
		set.add("Four");
		set.add("Six");
		set.add("Five");
		set.add("Two");

		// adding duplicate element - not allowed
		set.add("Six");

		// adding null element - not allowed throwing NullPointerException
		//set.add(null);

		// checking ordering - ascending (Five, Four, One, Six, Three, Two)
		set.iterator().forEachRemaining(l -> {
			System.out.print(l + ", ");
		});
		System.out.println();

	}

}
