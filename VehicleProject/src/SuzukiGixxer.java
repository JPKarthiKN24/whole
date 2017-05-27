import java.util.Random;

public class SuzukiGixxer implements Bike {
	static int mil;
	public SuzukiGixxer() {
		// TODO Auto-generated constructor stub
	}
	public void breaking(){
		String bs="manual double disc";
		System.out.println("Breaking system : "+bs);
		
	}
	public void getMillage() {
		 mil=60;
		System.out.println("Milage : "+mil);
		
		
	}
	public void getCc() {
		int c=150;
		System.out.println("cc : "+c);
		
	}
    public void displayGearnumber(){
    	int t = 0;
		Random rand = new Random();
			t = rand.nextInt(5) + 1;
			System.out.println("Gear number : "+t);
    	
    } 
}
