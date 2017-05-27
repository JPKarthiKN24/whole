
public class Adder {
 
	public static int addone(int a){
		return a++;
	}
	public static void main(String[] args){
		int a=5;
		int result=addone(a++);
		System.out.println("Adding one to the variable 'a' result in" +result);
		if(result==6)
			System.out.println("Test pass");
		else
			System.out.println("Test fails");
	}
	
}