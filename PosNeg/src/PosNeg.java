import static java.lang.System.out;

public class PosNeg {

	/**
	 * Given 2 int values, return true if one is negative and one is positive.
	 * Except if the parameter "negative" is true, then return true only if both
	 * are negative.
	 * 
	 * @param a
	 * @param b
	 * @param negative
	 * @return
	 */
	public static boolean posNeg(int a /*1*/, int b/*1*/, boolean negative /* TRUE */) {

		if (negative == false && (a < 0 || b < 0) && (a > 0 || b > 0))
			return true;
		else if ((negative == true) && (a < 0 && b < 0))
			return true;
		return false;
	}

	// testing main!
	public static void main(String args[]) {

		int a, b;
		boolean negative, result;
		a = 1;
		b = -1;
		negative = false;

		// TEST #1
		result = PosNeg.posNeg(a, b, negative);
		out.print("1, -1, false expect true result = " + result);
		if (result == true) {
			out.println("  PASS");
		} else {
			out.println("  FAILS");
		}

		// TEST #2
		a = -1;
		b = 1;
		result = PosNeg.posNeg(a, b, negative);
		out.print(a + ", " + b + ", false expect true result = " + result);
		if (result == true) {
			out.println("  PASS");
		} else {
			out.println("  FAILS");
		}

		// TEST #3
		a = 1;
		b = 1;
		result = PosNeg.posNeg(a, b, negative);
		out.print(a + ", " + b + ", false expect false result = " + result);
		if (result == false) {
			out.println("  PASS");
		} else {
			out.println("  FAILS");
		}

		// TEST #4
		a = -1;
		b = -1;
		result = PosNeg.posNeg(a, b, negative);
		out.print(a + ", " + b + ", false expect false result = " + result);
		if (result == false) {
			out.println("  PASS");
		} else {
			out.println("  FAILS");
		}

		// TEST #5
		a = -1;
		b = -1;
		result = PosNeg.posNeg(a, b, true);
		out.print(a + ", " + b + ", true expect true result = " + result);
		if (result == true) {
			out.println("  PASS");
		} else {
			out.println("  FAILS");
		}

		// TEST #6
		a = -1;
		b = 1;
		result = PosNeg.posNeg(a, b, true);
		out.print(a + ", " + b + ", true expect false result = " + result);
		if (result == false) {
			out.println("  PASS");
		} else {
			out.println("  FAILS");
		}
		
		// TEST #7
		a = 1;
		b = 1;
		result = PosNeg.posNeg(a, b, true);
		out.print(a + ", " + b + ", true expect false result = " + result);
		if (result == false) {
			out.println("  PASS");
		} else {
			out.println("  FAILS");
		}
	}
}
