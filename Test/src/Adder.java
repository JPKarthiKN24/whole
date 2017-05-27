
public class Adder {

	public static int addOne(int a){
		return ++a;	
	}
	public static void main(String args[]){
		int a=5;
		int result =Adder.addOne(a++);
		if(result==6)
			System.out.println("Test pass");
		else
			System.out.println("Test fail");
		
	}
}
