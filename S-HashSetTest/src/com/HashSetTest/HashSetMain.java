package com.HashSetTest;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		// adding element into set
		set.add("One");
		set.add("Three");
		set.add("Four");
		set.add("Six");
		set.add("Five");
		set.add("Two");

		// adding null element - allowed
		set.add(null);
		set.add("Eight");
		

		// adding duplicate element - not allowed (ignored)
		set.add("Six");

		// checking ordering - ascending (null, Eight, Six, Five, One, Four, Two, Three)
		set.iterator().forEachRemaining(l -> {
			System.out.print(l + ", ");
		});
		System.out.println();

	}

}
