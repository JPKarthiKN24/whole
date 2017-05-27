import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class HashSetCheck {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		Set<Integer> hs = new HashSet<Integer>();
        hs.add(3);
       // hs.add("A");
//        hs.add("B");
      //  hs.add(3");                     
     //   hs.add("A");
     //   hs.add(null);
     //   System.out.println("Set is "+hs);
    //    System.out.println(hs.add("B"));
		Random rand = new Random();
		int t;
		int e;
		sc = new Scanner(System.in);
		System.out.print("Enter the size:");
		int size=sc.nextInt();
		long startTime1 = System.currentTimeMillis();
		for(t=0;t<size;t++){
		e=rand.nextInt(100) + 0;
		hs.add(e);
		}
		long endTime1 = System.currentTimeMillis();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("The program time is: " + totalTime1);
		if(size<=100)
		System.out.println(hs);
		
		System.out.println("************&&&&&&&&&&&&&&%%%%%%%%%%%%%%%");
		Iterator<Integer> i=hs.iterator();
		
		//Iterator<Set<Integer>> entries = hm.entrySet().iterator();
		while (i.hasNext()) {
		    Integer entry = i.next();
		    System.out.println("Key = " + entry);
		}
	}
}
