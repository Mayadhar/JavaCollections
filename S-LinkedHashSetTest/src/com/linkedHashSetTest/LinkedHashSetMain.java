package com.linkedHashSetTest;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMain {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();

		// adding element into set
		set.add("One");
		set.add("Three");
		set.add("Four");
		set.add("Six");
		set.add("Five");
		set.add("Two");

		// adding null element - allowed
		set.add(null);
		set.add("Seven");

		// adding duplicate element - not allowed (ignored)
		set.add("Six");

		// checking ordering - insertion (One, Three, Four, Six, Five, Two, null, Seven)
		set.iterator().forEachRemaining(l -> {
			System.out.print(l + ", ");
		});
		System.out.println();

	}

}
