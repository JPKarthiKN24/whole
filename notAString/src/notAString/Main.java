package notAString;

import java.util.Scanner;

/*
 * Written by Karthik-Shanmugam On 12/04/2017
 * NotAString
 */

public class Main {

	public static String notAString(String p) {
		String s1 = "not ";
		String s3 = "";
		String s2 = p;

		char[] c = s2.toCharArray();
		if (s2.length() > 3) {
			if ((c[0] == 'n') && (c[1] == 'o') && (c[2] == 't') && (c[3] == ' ')) {
				s3 = s2;
			}

			else {
				s3 = s1.concat(s2);
			}
		} else {
			s3 = s1.concat(s2);
		}
		System.out.println("The string is :" + s3);
		return s3;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s = sc.nextLine();
		Main.notAString(s);

	}

}
