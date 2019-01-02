package com.synchronousQueueTest;

import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueMain {

	public static void main(String[] args) {
		Queue<String> queue = new SynchronousQueue<>();

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
