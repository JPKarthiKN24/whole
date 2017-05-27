

	import java.util.ArrayList;
	import java.util.List;
	import java.util.concurrent.ThreadLocalRandom;

	public class MainController {

		
		// this is the production run 
		public static void main(String args[]) {
			
			
			List<Integer> collection = new ArrayList<Integer>();
			int result1 = 0;
			int result2 = 0;
			int result3 = 0;
			int result4 = 0;
			
			for(int i = 0; i < 10; i++) {
			
				collection.clear();
				
				// get the randomly generated numbers
				RandomNumberGenerator.generate(collection);
				
				System.out.println("Running Sum5th on a collection of size = " + collection.size());
				
				// get the sum of all of the 5th numbers in the collection
				result1 = SumOfEvery5thCounter.sumEvery5th(collection);
				System.out.println("count of 6 is " + result1);
				
				result2 = SumOfEvery5thCounter.sumEvery9th(collection);
				System.out.println("count of 9 is " + result2);
				
				result3 = CountConsective.CountCon6th(collection);
				System.out.println("count of 6 is " + result3);
				
				result4 = CountConsective.CountCon9th(collection);
				System.out.println("count of 9 is " + result4);
			}
			
			
		}
	

}
