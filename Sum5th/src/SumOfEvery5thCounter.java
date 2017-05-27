import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SumOfEvery5thCounter {

	public static int sumEvery5th(List<Integer> collection) {

		
		int r1=0;
		for (int i = 0; i < collection.size(); i ++) {
			if(collection.get(i)==6){
				
				++r1;
			}
		}

		return r1;
	}
	
	public static int sumEvery9th(List<Integer> collection) {

		
		int r1=0;
		for (int i = 0; i < collection.size(); i ++) {
			if(collection.get(i)==9){
				
				++r1;
			}
		}

		return r1;
	}

	// This is the test code
	public static void main(String args[]) {

		Integer[] case1Array = { 2, 9, 7, 4, 3, 33, 60, 2, 4, 9, 7 };  // 42
		Integer[] case2Array = { 3, 5, 7, 10, 4, 7, 1, 6, 0, 3, 9, 2, 7, 8, 1, 1, 5 };   // 20
		Integer[] case3Array = { 3, 5, 7, 10, 4 };   // 3 
		Integer[] case4Array = {  };   // 0
		int result = 0;

		List<Integer> case1 = Arrays.asList(case1Array);
		List<Integer> case2 = Arrays.asList(case2Array);
		List<Integer> case3 = Arrays.asList(case3Array);
		List<Integer> case4 = Arrays.asList(case4Array);

		result = SumOfEvery5thCounter.sumEvery5th(case1);

		if (result == 42) {
			System.out.println("OK");
		} else {
			System.out.println("FAIL - " + result + " but we expected 42");
		}

		result = SumOfEvery5thCounter.sumEvery5th(case2);

		if (result == 20) {
			System.out.println("OK");
		} else {
			System.out.println("FAIL - " + result + " but we expected 20");
		}

		result = SumOfEvery5thCounter.sumEvery5th(case3);

		if (result == 3) {
			System.out.println("OK");
		} else {
			System.out.println("FAIL - " + result + " but we expected 3");
		}
		
		result = SumOfEvery5thCounter.sumEvery5th(case4);

		if (result == 0) {
			System.out.println("OK");
		} else {
			System.out.println("FAIL - " + result + " but we expected 0");
		}
	}
}
