package multiple3And5;

/*
 * Written by Karthik-Shanmugam On 12/04/2017
 * Multiple3Or5_Testcode
 */

public class TestingMultiple3Or5 {
	public static void main(String[] args) {

		int a1 = 25;
		int a2 = 26;
		int a3 = 15;
		int a4 = 6;
		int a5 = 70;
		int a6 = 30;
		int a7 = 12;
		int a8 = 2;
		int a9 = 50;
		boolean result1 = Multiple.multipleOf3Or5Only(a1);
		boolean result2 = Multiple.multipleOf3Or5Only(a2);
		boolean result3 = Multiple.multipleOf3Or5Only(a3);
		boolean result4 = Multiple.multipleOf3Or5Only(a4);
		boolean result5 = Multiple.multipleOf3Or5Only(a5);
		boolean result6 = Multiple.multipleOf3Or5Only(a6);
		boolean result7 = Multiple.multipleOf3Or5Only(a7);
		boolean result8 = Multiple.multipleOf3Or5Only(a8);
		boolean result9 = Multiple.multipleOf3Or5Only(a9);

		boolean expected1 = true;
		if (result1 == expected1) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILS");
		}

		boolean expected2 = false;
		if (result2 == expected2) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILS");
		}

		boolean expected3 = false;
		if (result3 == expected3) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILS");
		}

		boolean expected4 = true;
		if (result4 == expected4) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILS");
		}

		boolean expected5 = true;
		if (result5 == expected5) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILS");
		}

		boolean expected6 = false;
		if (result6 == expected6) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILS");
		}

		boolean expected7 = true;
		if (result7 == expected7) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILS");
		}

		boolean expected8 = false;
		if (result8 == expected8) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILS");
		}

		boolean expected9 = true;
		if (result9 == expected9) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILS");
		}

	}
}
