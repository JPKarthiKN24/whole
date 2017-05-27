package contactnewapp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
//		while(true)
//		{
//			
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter monNo");
			String mobNo=sc.next();
			System.out.println("enter email");
			String email=sc.next();
			
			StoreDatas store=new StoreDatas();
			store.setName(name);
			store.setMonNo(mobNo);
			store.setEmail(email);
			
			Pojo.obj.put(name, store);
			
			System.out.println("enter contact name");
			String currentContacName=sc.next();
			Pojo.retrive(currentContacName);
			
			Pojo.showContacts();
		//}
		
	}
}
