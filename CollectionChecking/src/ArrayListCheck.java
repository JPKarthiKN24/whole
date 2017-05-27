import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListCheck {

	private static Scanner sc;

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Random rand = new Random();
		int t;
		int e;
		sc = new Scanner(System.in);
		System.out.print("Enter the size:");
		int size = sc.nextInt();
		long startTime1 = System.currentTimeMillis();
		for (t = 0; t < size; t++) {
			e = rand.nextInt(100) + 0;
			al.add(e);
		}
		System.out.println("ALLL :: " + al);
		long endTime1 = System.currentTimeMillis();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("The program time is: " + totalTime1);
		long startTime11 = System.currentTimeMillis();
		;
		for (int a = 0; a < 10; a++) {

			//al.set(a, rand.nextInt(50) + 1);
			al.add(a, rand.nextInt(50) + 1);
			System.out.println("ALLL :: " + al);
		}

		long endTime22 = System.currentTimeMillis();
		// System.out.println(endTime);
		long totalTime22 = endTime22 - startTime11;
		System.out.println("The program time22 is: " + totalTime22);
 
		long startTime2 = System.currentTimeMillis();
		System.out.println(al.get(5));
		long endTime2 = System.currentTimeMillis();
		// System.out.println(endTime);
		long totalTime2 = endTime2 - startTime2;
		System.out.println("The program time22 is: " + totalTime2);

		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		System.out.println(al.size());
		System.out.println(al.remove(5));
		System.out.println(al.get(5));
		System.out.println(al.size());
		al.add(8);
		System.out.println(al.size());
		al.trimToSize();
		System.out.println(al.size());

		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		long totalTime = endTime - startTime;
		System.out.println("The program time is: " + totalTime);
		System.out.println(al.size());

	}
}
