import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

public class LinkedHashMapCheck {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Integer> lhm=new LinkedHashMap<Integer, Integer>();
		Random rand = new Random();
		int t;
		int e;
		sc = new Scanner(System.in);
		System.out.print("Enter the size:");
		int size=sc.nextInt();
		long startTime1 = System.currentTimeMillis();
		for(t=0;t<size;t++){
			e=rand.nextInt(100) + 0;
			lhm.put(t,e);
		}
		long endTime1 = System.currentTimeMillis();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("The program time is: " + totalTime1);
		long startTime2 = System.currentTimeMillis();
		System.out.println(lhm.get(5));
		long endTime2 = System.currentTimeMillis();
		//System.out.println(endTime);
		long totalTime2 = endTime2 - startTime2;
		System.out.println("The program time is: " + totalTime2);
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		System.out.println(lhm.size());
		System.out.println(lhm.remove(5));
		System.out.println(lhm.get(5));
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		long totalTime = endTime - startTime;
		System.out.println("The program time is: " + totalTime);
		System.out.println(lhm.size());
		
	}

}
