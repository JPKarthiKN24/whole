import java.util.Scanner;

public class MainController {
	public static void main(String[] args) {

		SuzukiGixxer b1 = new SuzukiGixxer();
		YamazaR15 b2 = new YamazaR15();
		HondaCBR b3 = new HondaCBR();

		String g;
		Bike m = new Test();
		Bike t = m;
		int a = 1;
		while (a == 1) {
			System.out.println("1<--Gixxer  2<--R15   3<--CBR150R  4<--Quit");
			System.out.print("Enter your option : ");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			if (i == 1)

				if (i == 4)
					break;
			if (i == 1) {
				t = b1;
				b1.displayGearnumber();
			} else if (i == 2) {
				t = b2;
				b2.getComfort();
			} else if (i == 3) {
				t = b3;
				b3.getAbs();
			} else {
				System.out.println("Enter valid number");
			}

			t.breaking();
			t.getMillage();
			t.getCc();
			System.out.println(SuzukiGixxer.mil);
			System.out.println("If u want to continue press 1");
			a = sc.nextInt();
		}

	}
}
