import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LinkedHashSetCheck {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		Random rand = new Random();
		int t;
		int e;
		sc = new Scanner(System.in);
		System.out.print("Enter the size:");
		int size=sc.nextInt();
		long startTime1 = System.currentTimeMillis();
		for(t=0;t<size;t++){
			e=rand.nextInt(100) + 0;
			lhs.add(e);
		}
		long endTime1 = System.currentTimeMillis();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("The program time is: " + totalTime1);
		long startTime2 = System.currentTimeMillis();
		LinkedList<Integer> linkedList = new LinkedList<Integer>(lhs);
		LinkedList<Integer> ll=linkedList;
		System.out.println(ll.get(5));
		long endTime2 = System.currentTimeMillis();
		//System.out.println(endTime);
		long totalTime2 = endTime2 - startTime2;
		System.out.println("The program time is: " + totalTime2);
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		System.out.println(lhs.size());
		System.out.println(lhs.remove(5));
		System.out.println(ll.get(5));
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		long totalTime = endTime - startTime;
		System.out.println("The program time is: " + totalTime);
		System.out.println(lhs.size());
		
	}

}
