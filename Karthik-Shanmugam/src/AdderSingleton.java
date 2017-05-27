
public class AdderSingleton {
	
	private static AdderSingleton INSTANCE = null;
	
	private AdderSingleton() {}

	public static AdderSingleton getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new AdderSingleton();
		}
		return INSTANCE;
	}
	
	public int addOne(int a) {
		return ++a;
	}
	
	

	
}
