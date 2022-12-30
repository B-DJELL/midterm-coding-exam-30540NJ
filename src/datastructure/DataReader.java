package datastructure;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Database, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */


			public static void main(String[] args) {
				String textFile = "C:\\Users\\BHD\\midterm-coding-exam\\src\\data\\self-driving-car";
				Stack<String> stack = new Stack<>();
				LinkedList<String> linkedList = new LinkedList<>();
				try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
					String line;
					while ((line = reader.readLine()) != null) {
						String[] words = line.split("\\s+");
						for (String word : words) {
							stack.push(word);
							linkedList.add(word);
						}
					}
				} catch (IOException e) {
					System.out.println("Error reading file: " + e.getMessage());
				}

				// Print data from linked list in FIFO order
				System.out.println("Retrieving data from linked list in FIFO order:");
				while (!linkedList.isEmpty()) {
					System.out.println(linkedList.poll());
				}

				// Print data from stack in FILO order
				System.out.println("Retrieving data from stack in FILO order:");
				while (!stack.isEmpty()) {
					System.out.println(stack.pop());
				}
			}
		}
