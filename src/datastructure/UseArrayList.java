package datastructure;
import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> cars = new ArrayList<>();


		cars.add("LUXURY CAR");
		cars.add("CAR OF THE YEAR");
		cars.add("PERSONALIZED CAR FOR BADREDDINE");


		System.out.println("First element: " + cars.get(0));


		cars.remove(1);


		System.out.println("Elements in the ArrayList:");
		for (String color : cars) {
			System.out.println(color);
		}


		System.out.println("Elements in the ArrayList (iterator):");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

	}

}