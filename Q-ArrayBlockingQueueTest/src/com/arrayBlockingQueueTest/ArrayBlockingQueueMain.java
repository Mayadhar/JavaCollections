package com.arrayBlockingQueueTest;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueMain {

	public static void main(String[] args) {
		Queue<String> queue = new ArrayBlockingQueue<>(10);

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
