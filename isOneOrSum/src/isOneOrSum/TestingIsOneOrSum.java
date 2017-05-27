package isOneOrSum;

/*
 * Written by Karthik-Shanmugam On 12/04/2017
 * IsOneOrSum_Testcode
 */

public class TestingIsOneOrSum {
	public static void main(String[] args) {

		boolean expected1 = true;
		boolean expected2 = false;

		// Test #1
		boolean b1 = IsOneOrSum.oneOrSum(9, 10);
		if (expected1 == b1)
			System.out.println("Pass");
		else
			System.out.println("FAIL");

		// Test #2
		boolean b2 = IsOneOrSum.oneOrSum(9, 9);
		if (expected2 == b2)
			System.out.println("Pass");
		else
			System.out.println("FAIL");

		// Test #3
		boolean b3 = IsOneOrSum.oneOrSum(1, 9);
		if (expected1 == b3)
			System.out.println("Pass");
		else
			System.out.println("FAIL");

	}
}
