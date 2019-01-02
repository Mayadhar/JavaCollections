package com.delayQueueTest;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

//needs to implement w.r.t DelayQueue
public class DelayQueueMain {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedBlockingQueue<>();

		// adding element into set
		queue.add("One");
		queue.add("Three");
		queue.add("Four");
		queue.add("Six");
		queue.add("Five");
		queue.add("Two");

		// adding null element - not allowed throwing NullPointerException
		// queue.add(null);
		queue.add("Seven");

		// adding duplicate element - allowed
		queue.add("Six");

		// checking ordering - ascending (One, Three, Four, Six, Five, Two, Seven, Six)
		queue.iterator().forEachRemaining(l -> {
			System.out.print(l + ", ");
		});
		System.out.println();

	}

}
