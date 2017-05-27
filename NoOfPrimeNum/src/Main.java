import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Main.getPrime(a);

	}

	public static void getPrime(int x) {
		int y;
		if (x != 1) {
			for (y = 1; y <= x; y++) {
				int c;
				int b;
				int d = 0;
				int a = y;
				b = a / 2;
				for (c = 2; c < b; c++) {
					if (a % c == 0) {
						System.out.println(a + " Not a prime.");
						++d;
						break;
					}
				}
				if (d == 0) {
					System.out.println(a + " Prime.");
				}
			}
		}

		else {
			System.out.println(x + " Not valid");
		}

	}
}
