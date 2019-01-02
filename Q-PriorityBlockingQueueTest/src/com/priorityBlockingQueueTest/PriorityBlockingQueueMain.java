package com.priorityBlockingQueueTest;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityBlockingQueueMain {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();

		// adding element into set
		queue.add("One");
		queue.add("Three");
		queue.add("Four");
		queue.add("Five");
		queue.add("Six");
		queue.add("Two");

		// adding null element - not allowed throwing NullPointerException
		//queue.add(null);
		queue.add("Seven");

		// adding duplicate element - not allowed
		queue.add("Six");
		queue.add("Eight");

		// checking ordering - ascending (Five, Four, One, Six, Six, Two, Seven, Three)
		queue.iterator().forEachRemaining(l -> {
			System.out.print(l + ", ");
		});
		System.out.println();

	}

}
