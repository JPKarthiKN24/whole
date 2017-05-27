import java.util.ArrayList;
import java.util.Random;
import java.util.Collection;
import java.util.List;


public class RandomNumberGenerator {
	
	private static final int MIN = 0;
	private static final int MAX = 100;
	private static final int SIZE = 10000000;
	
	public static void generate(Collection<Integer> collection) {
		
		int randomNum = 0;
		Random rand = new Random();
		
		for(int i = 0; i < SIZE; i++) {
			// nextInt is normally exclusive of the top value,
			// so add 1 to make it inclusive
			randomNum = rand.nextInt(100) + 1;
			collection.add(randomNum);
		}
	}
	

	// This is the test code
	public static void main(String args[]) {
		
		List<Integer> collection = new ArrayList<Integer>();
		
		RandomNumberGenerator.generate(collection);
		
		System.out.println("Collection type is " + collection.getClass().getName());
		
		// verify size constraint is met
		if(collection.size() == 10000000) {
			System.out.println("Size test OK");
		} else {
			System.out.println("Size test FAILS - expected 10000000 got " + collection.size());
		}
		
		// verify range constraint is met
		int i = 0;		
		boolean isWithinRange = false;
		while(i < SIZE - 1) {
			if( !(collection.get(i) >= 0 && collection.get(i) <= 100) ) {
				System.out.println("test FAILS on index " + i + " because " + collection.get(i) + " is not in range.");
				isWithinRange = false;
				break;
			} else {
				isWithinRange = true;
			}
			++i;
			//if(collection.get(i) % 10 == 0) {
				// System.out.println(collection.get(i));
			//}
		}
		//System.out.println(collection.get(SIZE - 1));
		
		
		if(isWithinRange == true) {
			System.out.println("Range Test OK");
		} else {
			System.out.println("Range Test FAILS");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
