package datastructure;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;
public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		LinkedList<String> list = new LinkedList<>();
		Stack<String> stack = new Stack<>();
		try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split(" ");
				for (String word : words) {
					list.add(word);
					stack.push(word);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Retrieve data from LinkedList in FIFO order
		System.out.println("Retrieving data from LinkedList in FIFO order:");
		for (String word : list) {
			System.out.println(word);
		}
		// Retrieve data from Stack in FILO order
		System.out.println("\nRetrieving data from Stack in FILO order:");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}




