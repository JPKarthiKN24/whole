import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapCheck {

	private static Scanner sc;

	public static void main(String[] args) {
	
		TreeMap<Integer, Integer> tm=new TreeMap<Integer, Integer>();
		Random rand = new Random();
		int t;
		int e;
		sc = new Scanner(System.in);
		System.out.print("Enter the size:");
		int size=sc.nextInt();
		long startTime1 = System.currentTimeMillis();
		for(t=0;t<size;t++){
			e=rand.nextInt(100) + 0;
			tm.put(t,e);
		}
		long endTime1 = System.currentTimeMillis();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("The program time is: " + totalTime1);
		long startTime2 = System.currentTimeMillis();
		System.out.println(tm.get(5));
		long endTime2 = System.currentTimeMillis();
		//System.out.println(endTime);
		long totalTime2 = endTime2 - startTime2;
		System.out.println("The program time is: " + totalTime2);
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		System.out.println(tm.size());
		System.out.println(tm.remove(5));
		System.out.println(tm.get(5));
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		long totalTime = endTime - startTime;
		System.out.println("The program time is: " + totalTime);
		System.out.println(tm.size());
		
}
	
}
