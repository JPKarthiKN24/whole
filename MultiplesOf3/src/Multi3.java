import java.util.Scanner;

public class Multi3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + ": HELLO");
			} else if (i % 3 == 0) {
				System.out.println(i + ": Hi");
			} else if (i % 5 == 0) {

				System.out.println(i + ": HEY");
			}

			else if (i < 10) {
				switch (i) {
				case 1:
					System.out.println(i + " :ONE");
					break;
				case 2:
					System.out.println(i + ": TWO");
					break;
				case 3:
					System.out.println(i + ": THREE");
					break;
				case 4:
					System.out.println(i + ": FOUR");
					break;
				case 5:
					System.out.println(i + ": FIVE");
					break;
				case 6:
					System.out.println(i + ": SIX");
					break;
				case 7:
					System.out.println(i + ": SEVEN");
					break;
				case 8:
					System.out.println(i + ": EIGHT");
					break;
				case 9:
					System.out.println(i + ": NINE");
					break;

				}

			} else {
				System.out.println(i + ": " + i);

			}

		}
	}

}
