package ContactList;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainController {
	
	Map<String, HashMap<String, HashMap<String, String>>> map = new HashMap<String, HashMap<String, HashMap<String, String>>>();
	static ContactView obj = new ContactView();
	public static void main(String[] args) throws IOException {
		
		MainController mc=new MainController();
		
		boolean b=true;
		while(b){
			int t=obj.choose();
		switch(t){
		case 1:mc.addContact();
		     break;
		case 2:mc.viewContacts();
		 break;
		case 3:b=false;
			 break;
		}
		}
	}
	public void addContact() throws IOException{
		
		String name = "";
		String numberType = "";
		String number = "";
		String email = "";
		
		
		int choose=obj.ContactView();
		
		while(choose==1 || choose==2 ||choose==3 ||choose==4){
		switch(choose){

		case 1:
			   name = obj.getAContact(choose);
		       break;
		case 2:numberType=obj.getAContact(choose);
		       break;
		case 3:number=obj.getAContact(choose);
		       break;
		case 4:email=obj.getAContact(choose);
		       break;
		default:System.out.println("Enter valid number");
			    break;
		}
		choose=obj.ContactView();
		
		}

		map.put(name, new HashMap<String, HashMap<String, String>>());

		map.get(name).put(numberType, new HashMap<String, String>());

		map.get(name).get(numberType).put(number, email);
		
		Contact c1=new Contact();
        c1.setName(name);
        c1.setNumberType(numberType);
        c1.setNumber(number);
        c1.setEmail(email);
		
	}
	
	private void viewContacts() {
        System.out.println(map);
	 
	    }

}