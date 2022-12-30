package datastructure;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> queue = new LinkedList<>();

		// Add elements to the queue
		queue.add("Agile");
		queue.add("QA Tester");
		queue.add("PO");

		System.out.println("Queue: " + queue);

		// Peek at the head of the queue
		System.out.println("Peek: " + queue.peek());

		// Remove the head of the queue
		System.out.println("Removed: " + queue.remove());
		System.out.println("Queue: " + queue);

		// Poll the head of the queue
		System.out.println("Polled: " + queue.poll());
		System.out.println("Queue: " + queue);

		// Use a for-each loop to retrieve the elements of the queue
		System.out.println("Retrieving elements with for-each loop:");
		for (String element : queue) {
			System.out.println(element);
		}

		// Use a while loop and an Iterator to retrieve the elements of the queue
		System.out.println("\nRetrieving elements with while loop and Iterator:");
		while (!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}
	}

}


