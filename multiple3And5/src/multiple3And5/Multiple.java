package multiple3And5;

import java.util.Scanner;

/*
 * Written by Karthik-Shanmugam On 12/04/2017
 * Multiple3Or5Only
 */

public class Multiple {

	public static boolean multipleOf3Or5Only(int q) {
		if ((q % 3 == 0) && (q % 5 == 0)) {
			return false;
		} else if ((q % 3 == 0) || (q % 5 == 0)) {
			return true;
		} else
			return false;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the variable p :");
		int p = sc.nextInt();
		boolean result = multipleOf3Or5Only(p);
		System.out.println("The result is : " + result);

	}

}
