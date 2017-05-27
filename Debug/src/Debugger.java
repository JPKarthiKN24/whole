import java.util.*;

public class Debugger {

	public static long calculateA(long a) {

		for (int i = 0; i < 4; i++) {
			a = a++ * a;
		}

		return ++a;
	}

	public static void main(String[] args) {

		long a = 3;

		long result = Debugger.calculateA(a);

		System.out.println("The result is : " + result);

		if (result == 43046721) {
			System.out.println("Test PASSES");
		} else {
			System.out.println("Test FAILS");
		}
	}
}
