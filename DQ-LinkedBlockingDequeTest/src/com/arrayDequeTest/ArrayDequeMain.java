package com.arrayDequeTest;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeMain {

	public static void main(String[] args) {
		Deque<String> queue = new ArrayDeque<>(10);

		// adding element into set
		queue.add("One");
		queue.add("Three");
		queue.add("Four");
		queue.add("Six");
		queue.add("Five");
		queue.add("Two");

		// adding null element - not allowed throwing NullPointerException
		//queue.add(null);
		queue.add("Seven");

		// adding duplicate element - not allowed
		queue.add("Six");

		// checking ordering - ascending (Five, Four, One, Six, Three, Two)
		queue.iterator().forEachRemaining(l -> {
			System.out.print(l + ", ");
		});
		System.out.println();

	}

}
