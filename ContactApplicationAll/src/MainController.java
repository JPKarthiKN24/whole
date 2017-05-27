import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.NameList;

public class MainController {
	
	
	public static void main(String[] args) {
		
		ContactView cv=new ContactView();
		MainController mc=new MainController();
		Contacts c=new Contacts();
		ContactList cl=new ContactList();
		//ContactList cl=new ContactList();
        do{
	    int r=cv.displayMainMenu();
		
		switch (r) {
		case 1:
			mc.add(cv, c);
			break;
			
        case 2:
			mc.update(cv,c);
			break;	
		case 3:
			mc.view(cv,c);
			break;
		case 4:
			mc.search(cv,c);
			break;
		case 5:
			mc.searchN(cl,c);
			break;
		case 6:
			
			break;
		case 7:
			System.exit(0);
		    break;
		default:
			break;
		
		}
        }while(true);
	}	

	private void update(ContactView cv, Contacts c) {
		//cv.update(c.updateContact());
		
	}

	private void view(ContactView cv, Contacts c) {
		
		cv.printContact(c);
		
	}

	public void add(ContactView cv, Contacts c) {
		
		ContactList cl=new ContactList();
		
		cl.setNameList(cv.addName());
		cl.setPhoneNumberList(cv.addPhone());
		cl.setEmailList(cv.addEmail());
		c.addContact(cl);
		
	}
    
	public void search(ContactView cv, Contacts c) {

		int index = cv.printContactList(c);
		if (index >= 0)
			cv.printContact(c.getContact(index));
	}
	
	public void searchN(ContactList cl, Contacts c){
		Scanner sc=new Scanner(System.in);
		String nameSearch=sc.next();
		NameContact cl1=c.getSearchContact(nameSearch, cl);
		
	}
}
