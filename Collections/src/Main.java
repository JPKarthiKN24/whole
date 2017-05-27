import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
	public static void main(String[] args) {
		ArrayList<Object>  c=new ArrayList<Object>();
		 c.add(1);
		 c.add(2);
		 c.add(3);
		 c.add(4);
		 c.add(5);
		 c.add(6.8);
		 int q= c.indexOf(5);
		
		for(Object i:c){
			System.out.println(i);
			
		}
		System.out.println(q);
	}
	

}
