package ContactList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactView{
	
	private String name="";
	private String numberType="";
	private String number="";
	private String email="";
	Scanner sc=new Scanner(System.in);
	BufferedReader keyIn = new BufferedReader(new InputStreamReader(System.in));
	
	public ContactView(){
		
	}
	
	public int ContactView(){
		int y;
		System.out.print("Enter number");
		y=sc.nextInt();
	   return y;
	}
	
	public String getAContact(Object o) throws IOException {
	if(o.equals(1))
		System.out.println("1<--Name/n2<--Numbertype/n3<--Number/n4<--Email/n5<--Quit");
	
	if(o.equals(1)){
		System.out.print("Enter Name:");
	name=keyIn.readLine();
	return name;}
	else if(o.equals(2)){
		System.out.print("Enter numbertype:");
		numberType=keyIn.readLine();
		return numberType;	
	}
	else if(o.equals(3)){
		System.out.print("Enter number");
		number=keyIn.readLine();
		return number;	
	}
	else if(o.equals(4)){
		System.out.print("Enter Email");
		email=keyIn.readLine();
		return email;	
	}
	else
		System.out.println("Enter valid number");
	return "";
}

public ContactView(String name){
    this.name = name;
}

public ContactView(String numberType,int o){
    this.numberType = numberType;
}

public ContactView(String numberType,double d){
    this.numberType = numberType;
}

public ContactView(String email,char c){
    this.email = email;
}

public String toString()
{
	return String.format("Name: %s%nNumber Type: %s%nNumber: %s%nemail: %s%n", name, numberType, number, email);
}

public int choose(){
	System.out.println("1<--Add Contact");
	System.out.println("2<--View Contact");
	System.out.println("3<--Quit");
	System.out.print("Enter the your option:");
	int t=sc.nextInt();
	return t;
}
}
