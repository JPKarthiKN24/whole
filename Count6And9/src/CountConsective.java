import java.util.Arrays;
import java.util.List;

/**
 * Written by Karthik_Shanmugam on 18/04/2017 
 * Count6&9
 */

public class CountConsective {

	public static int CountCon6th(List<Integer> collection) {

		int y = 0;
		int r1 = 0;
		for (int i = 0; i < collection.size() - 1; i++) {
			if (collection.get(i) == 6) {
				y = i + 1;
				if (y <= 10000000) {
					if (collection.get(y) == 6) {

						r1 = r1 + 2;
					}
				}
			}
		}
		return r1;

	}

	public static int CountCon9th(List<Integer> collection) {

		int r1 = 0;
		for (int i = 0; i < collection.size() - 1; i++) {
			if (collection.get(i) == 9) {
				if (collection.get(i + 1) == 9) {

					r1 = r1 + 2;
				}
			}
		}
		return r1;
	}

	// This is the test code
	public static void main(String args[]) {

		Integer[] case1Array = { 4, 9, 6, 6, 9, 22, 6, 6, 9, 66, 9, 9, 5, 6 };
		Integer[] case2Array = { 6, 9, 9, 6, 9, 8, 6, 6, 3, 9, 6, 66, 7, 66, 6, 6, 9, 9 };
		Integer[] case3Array = { 6, 6, 9, 9, 99 };
		Integer[] case4Array = {};
		int result = 0;

		List<Integer> case1 = Arrays.asList(case1Array);
		List<Integer> case2 = Arrays.asList(case2Array);
		List<Integer> case3 = Arrays.asList(case3Array);
		List<Integer> case4 = Arrays.asList(case4Array);

		// Count 6 Test Case
		System.out.println("Testing Count consective_6");

		result = CountConsective.CountCon6th(case1);

		if (result == 4) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL - " + result + " but we expected 4");
		}

		result = CountConsective.CountCon6th(case2);

		if (result == 4) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL - " + result + " but we expected 4");
		}

		result = CountConsective.CountCon6th(case3);

		if (result == 2) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL - " + result + " but we expected 2");
		}

		result = CountConsective.CountCon6th(case4);

		if (result == 0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL - " + result + " but we expected 0");
		}

		// Count 9 Test Case
		System.out.println("Testing Count consective_9");

		result = CountConsective.CountCon9th(case1);

		if (result == 2) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL - " + result + " but we expected 2");
		}

		result = CountConsective.CountCon9th(case2);

		if (result == 4) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL - " + result + " but we expected 4");
		}

		result = CountConsective.CountCon9th(case3);

		if (result == 2) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL - " + result + " but we expected 2");
		}

		result = CountConsective.CountCon9th(case4);

		if (result == 0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL - " + result + " but we expected 0");
		}
	}

}
