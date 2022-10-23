// Java program to illustrate HashMap class of java.util
// package

// Importing HashMap class
import java.util.HashMap;

// Main class
public class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Create an empty hash map by declaring object
		// of string and integer type
		HashMap<String, Integer> map = new HashMap<>();

		// Adding elements to the Map
		// using standard put() method
		map.put("Rahul", 10);
		map.put("Ravi", 30);
		map.put("Samay", 20);

		// Print size and content of the Map
		System.out.println("Size of map is:- "
						+ map.size());

		// Printing elements in object of Map
		System.out.println(map);

		// Checking if a key is present and if
		// present, print value by passing
		// random element
		if (map.containsKey("Rahul")) {

			// Mapping
			Integer a = map.get("Rahul");

			// Printing value for the corresponding key
			System.out.println("value for key"
							+ " \"Rahul\" is:- " + a);
		}
	}
}
