
import static java.lang.System.out;

//The code is written by Karthik Shanmugam on 07/04/2017
public class Test {

	public static boolean pogNeg(int a, int b, boolean boo) {

		if (boo == false && (a < 0 || b < 0) && (a > 0 || b > 0))
			return true;
		else if ((boo == true) && (a < 0 && b < 0))
			return true;
		return false;
	}

	public static void main(String[] args) {

		int a, b;
		boolean negative, result;

		// TEST #1
		a = 1;
		b = -1;
		negative = false;
		result = Test.pogNeg(a, b, negative);
		out.println("1, -1, false expect true result = " + result);
		if (result == true) {
			out.println("PASS");
		} else {
			out.println("FAILS");
		}

		// TEST #2
		a = -1;
		b = 1;
		result = Test.pogNeg(a, b, negative);
		out.println(a + ", " + b + ", false expect true result = " + result);
		if (result == true) {
			out.println("PASS");
		} else {
			out.println("FAILS");
		}

		// TEST #3
		a = 1;
		b = 1;
		result = Test.pogNeg(a, b, negative);
		out.println(a + ", " + b + ", false expect false result = " + result);
		if (result == false) {
			out.println("PASS");
		} else {
			out.println("FAILS");
		}

		// TEST #4
		a = -1;
		b = -1;
		result = Test.pogNeg(a, b, negative);
		out.println(a + ", " + b + ", false expect false result = " + result);
		if (result == false) {
			out.println("PASS");
		} else {
			out.println("FAILS");
		}

		// TEST #5
		a = -1;
		b = -1;
		negative = true;
		result = Test.pogNeg(a, b, negative);
		out.println(a + ", " + b + ", true expect true result = " + result);
		if (result == true) {
			out.println("PASS");
		} else {
			out.println("FAILS");
		}

		// TEST #6
		a = -1;
		b = 1;
		negative = true;
		result = Test.pogNeg(a, b, negative);
		out.println(a + ", " + b + ", true expect false result = " + result);
		if (result == false) {
			out.println("PASS");
		} else {
			out.println("FAILS");
		}

		// TEST #7
		a = 1;
		b = 1;
		negative = true;
		result = Test.pogNeg(a, b, negative);
		out.println(a + ", " + b + ", true expect false result = " + result);
		if (result == false) {
			out.println("PASS");
		} else {
			out.println("FAILS");
		}
	}
}
