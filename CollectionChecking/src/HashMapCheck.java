import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

public class HashMapCheck {
	
	private static Scanner sc;

	public static void main(String[] args) {
		Map<Integer, Integer> hm=new HashMap<Integer, Integer>();
		Random rand = new Random();
		int t;
		int e;
		sc = new Scanner(System.in);
		System.out.print("Enter the size:");
		int size=sc.nextInt();
		long startTime1 = System.currentTimeMillis();
		for(t=0;t<size;t++){
			e=rand.nextInt(100) + 0;
			hm.put(t,e);
		}
		long endTime1 = System.currentTimeMillis();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("The program time is: " + totalTime1);
		long startTime2 = System.currentTimeMillis();
		System.out.println(hm.get(5));
		long endTime2 = System.currentTimeMillis();
		//System.out.println(endTime);
		long totalTime2 = endTime2 - startTime2;
		System.out.println("The program time is: " + totalTime2);
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		System.out.println(hm.size());
		
		System.out.println(hm.get(5));
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		long totalTime = endTime - startTime;
		System.out.println("The program time is: " + totalTime);
		System.out.println(hm.size());
		
		System.out.println("****************++++++++++++++++++********************");
		
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
		for (Integer key : hm.keySet()) {
		    System.out.println("Key = " + key);
		}

		//iterating over values only
		for (Integer value : hm.values()) {
		    System.out.println("Value = " + value);
		}
		
		Iterator<Map.Entry<Integer, Integer>> entries = hm.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry<Integer, Integer> entry = entries.next();
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
		}
	}


