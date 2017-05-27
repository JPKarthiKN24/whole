import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class VectorCheck {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		
		Random rand = new Random();
		int t;
		int e;
		sc = new Scanner(System.in);
		System.out.print("Enter the size:");
		int size=sc.nextInt();
		long startTime1 = System.currentTimeMillis();
		for(t=0;t<size;t++){
			e=rand.nextInt(100) + 0;
			v.add(e);
		}
		long endTime1 = System.currentTimeMillis();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("The program time is: " + totalTime1);
	}

}
