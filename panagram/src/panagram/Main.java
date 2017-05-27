

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the string");
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		int a=0;
		for(a=0; a<s.length();a++){
		int n=(int) c[a];
		
			if(n>26){
				System.out.println("Not panagram");
			}
			else{
				System.out.println(" panagram");
				
			}
		
		}
	}
}
