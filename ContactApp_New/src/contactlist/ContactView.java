package contactlist;

import java.util.Scanner;

public class ContactView {
Scanner sc=new Scanner(System.in);
Contact contact=new Contact();
private String name;
private String number;
private String numberType;
private String mailType;
private String email;
private String address;


	public Contact getContact() {
		System.out.print("Enter the name: ");
		name=sc.next();
		System.out.print("1<--Home/n2<--Office/n3<--Personal");
		int a=sc.nextInt();
		switch(a){
		case 1:numberType="Home";
		break;
		case 2:numberType="Office";
		break;
		case 3:numberType="Personal";
		break;
		default:System.out.print("Enter the valid number: ");
		
		}
		System.out.print("Enter the number: ");
		number=sc.next();
		System.out.print("1<--Home/n2<--Office/n3<--Personal");
		int b=sc.nextInt();
		switch(b){
		case 1:mailType="Home";
		break;
		case 2:mailType="Office";
		break;
		case 3:mailType="Personal";
		break;
		default:System.out.print("Enter the valid number: ");
		
		}
		System.out.print("Enter the email: ");
		email=sc.next();
		System.out.print("Enter the address: ");
		address=sc.next();
		return contact;	
	}
	
	public String getName(){
		return name;
	}
	
	public String getNumberType(){
		return numberType;
	}
	
	public String getNumber(){
		return number;
	}
	
	public String getemail(){
		return email;
	}
	
	public String getAddress(){
		return address;
	}

	public int showFirstMessage() {

       System.out.println("1<--Add contact \n2<--View Contact \n3<--Quit");
       int t=sc.nextInt();
       return t;
		
	}
	
    

}
