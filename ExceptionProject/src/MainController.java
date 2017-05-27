
public class MainController {

	public static void main(String[] args) {
		try {
            String s = "dffgh";
            int i = Integer.parseInt(s);
            // this line of code will never be reached
            System.out.println("int value = " + i);
        }
        catch (NumberFormatException nfe) {
           System.out.println("Exception");
        }
		
		int[] i=new int[2];
		i[0]=1;
		i[1]=2;
		System.out.println(i);
		try{
		i[2]=3;}
		catch(Exception e){
			System.out.println("index");
			
		}
	}
	
}
