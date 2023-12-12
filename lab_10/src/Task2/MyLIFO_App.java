package Task2;

import java.util.LinkedList;
import java.util.Queue;

public class MyLIFO_App {
	// method stutter that accepts a queue of integers as a parameter and replaces
		// every element of the queue with two copies of that element
		// front [1, 2, 3] back
		// becomes
		// front [1, 1, 2, 2, 3, 3] back
		public static <E> void stutter(Queue<E> input) {
		// TODO
			Queue<E> tempQueue = new LinkedList<>();

			while(!input.isEmpty()) {
				E element = input.poll();

				tempQueue.offer(element);
				tempQueue.offer(element);
			}

			while (!tempQueue.isEmpty()) {
				input.offer(tempQueue.poll());
			}

		}
		// Method mirror that accepts a queue of strings as a parameter and appends the
		// queue's contents to itself in reverse order
		// front [a, b, c] back
		// becomes
		// front [a, b, c, c, b, a] back
		public static <E> void mirror(Queue<E> input) {
		// TODO
			 Queue<E> tempQueue1 = new LinkedList<>();
			    Queue<E> tempQueue2 = new LinkedList<>();


			    while (!input.isEmpty()) {
			        tempQueue1.add(input.poll());
			    }

			    while (!tempQueue1.isEmpty()) {
			        tempQueue2.add(tempQueue1.poll());
			    }

			    while (!tempQueue2.isEmpty()) {
			        input.add(tempQueue2.poll());
			    }

			    while (!input.isEmpty()) {
			        input.add(input.poll());
			    }
		}
		public static void main(String[] args) {
			Queue<Integer> myQueue = new LinkedList<>();

			myQueue.offer(1);
			myQueue.offer(2);
			myQueue.offer(3);

			stutter(myQueue);
			//System.out.println(myQueue);

			 Queue<String> inputQueue = new LinkedList<>();
			    inputQueue.add("a");
			    inputQueue.add("b");
			    inputQueue.add("c");

			    mirror(inputQueue);

			    boolean mirrored = false;
			    while (!inputQueue.isEmpty() && !mirrored) {
			        inputQueue.add(inputQueue.poll());
			        mirrored = true;
			    }

			    System.out.println(inputQueue);
		}
}
