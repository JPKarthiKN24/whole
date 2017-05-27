
public class HondaCBR implements Bike {
static int mil;
	
	public void breaking() {
		String bs="ABS";
		System.out.println("Breaking system : "+bs);
		
	}	
	public void getMillage() {
		mil=30;
		System.out.println("Milage : "+mil);
		
	}
	public void getCc() {
		int c=250;
		System.out.println("CC : "+c);
		
	}
	public void getAbs(){
		System.out.println("Honda CBR150R has ABS system");
		
	}

}
