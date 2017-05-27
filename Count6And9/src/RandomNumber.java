import java.util.ArrayList;
import java.util.Random;
import java.util.Collection;
import java.util.List;

/**
 * Written by Karthik_Shanmugam on 18/04/2017
 * Count6&9
 */

public class RandomNumber {

	private static final int MIN = 1;
	private static final int MAX = 100;
	private static final int SIZE = 10000000;

	public static void generate(Collection<Integer> collection) {

		int randomNum = 0;
		Random rand = new Random();

		for (int i = 0; i < SIZE; i++) {

			randomNum = rand.nextInt(MAX) + MIN;
			collection.add(randomNum);
		}
	}

	// Test code
	public static void main(String args[]) {

		List<Integer> collection = new ArrayList<Integer>();

		RandomNumber.generate(collection);

		// Verify size
		if (collection.size() == 10000000) {
			System.out.println("Size test OK");
		} else {
			System.out.println("Size test FAILS - expected 10000000 got " + collection.size());
		}

		// Verify range
		int i = 0;
		boolean isWithinRange = false;
		while (i < SIZE - 1) {
			if (!(collection.get(i) >= 0 && collection.get(i) <= 100)) {
				System.out.println("test FAILS on index " + i + " because " + collection.get(i) + " is not in range.");
				isWithinRange = false;
				break;
			} else {
				isWithinRange = true;
			}
			++i;

		}

		if (isWithinRange == true) {
			System.out.println("Range Test OK");
		} else {
			System.out.println("Range Test FAILS");
		}
	}
}
