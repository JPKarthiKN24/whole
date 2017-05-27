import java.util.ArrayList;
import java.util.List;


/**
 * Written by Karthik_Shanmugam on 18/04/2017 
 * Count6&9
 */

public class Main {

	// this is the production code
	public static void main(String args[]) {

		List<Integer> collection = new ArrayList<Integer>();
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;

		//collection.clear();

		long startTime = System.currentTimeMillis();

		// Generate random numbers
		RandomNumber.generate(collection);

		System.out.println("Running Sum5th on a collection of size = " + collection.size());

		// Counting 6
		result1 = Count6_9.count6th(collection);
		System.out.println("count of 6 is " + result1);

		// Counting 9
		result2 = Count6_9.count9th(collection);
		System.out.println("count of 9 is " + result2);

		// Counting consective 6
		result3 = CountConsective.CountCon6th(collection);
		System.out.println("count of 6 is " + result3);

		// Counting consective 9
		result4 = CountConsective.CountCon9th(collection);
		System.out.println("count of 9 is " + result4);

		// Calcuating time
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("The program time is: " + totalTime);

	}

}
