package notAString;

/*Written by Karthik-Shanmugam On 12/04/2017
 * NotAString_Testcode
 */

public class TestingClass {

	public static void main(String[] args) {
		Main m = new Main();
		String s1 = "going to happen";
		String s2 = "a";
		String s3 = "not interested";

		String result1;
		String result2;
		String result3;
		String expected1 = "not going to happen";
		String expected2 = "not a";
		String expected3 = "not interested";

		// Test #1
		result1 = m.notAString(s1);
		if (result1.equals(expected1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILS");
		}

		// Test #2
		result2 = m.notAString(s2);
		if (result2.equals(expected2)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILS");
		}

		// Test #3
		result3 = m.notAString(s3);
		if (result3.equals(expected3)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILS");
		}

	}
}
