/**
 * Written by Karthik Shanmugam on 11/04/2017
 * IsOneOrSum_Challenge
 */
package isOneOrSum;

import java.util.Scanner;

public class IsOneOrSum {
	public static void main(String args[]) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the variable a & b :");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(IsOneOrSum.oneOrSum(a, b));

	}

	public static boolean oneOrSum(int x, int y) {
		if ((x == 10) | (y == 10)) {
			return true;
		} else if ((x + y) == 10) {
			return true;
		} else {
			return false;
		}

	}
}
