import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CountConsective {
	
public static int CountCon6th(List<Integer> collection) {

		int y=0;
		int r1=0;
		for (int i = 0; i < collection.size(); i ++) {
			if(collection.get(i)==6){
				y=i+1;
				if(y<=10000000){
				if( collection.get(y)==6){
				
				r1=r1+2;
			}
				}
		}
		}
		return r1;
	
}
	
	public static int CountCon9th(List<Integer> collection) {

		
			int r1=0;
			for (int i = 0; i < collection.size(); i ++) {
				if(collection.get(i)==9){
					if(collection.get(i+1)==9){
					
					r1=r1+2;
				}
			}
			}
			return r1;
	}

}
