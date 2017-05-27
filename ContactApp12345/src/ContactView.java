import java.util.Scanner;

public class ContactView {

	Scanner sc = new Scanner(System.in);
	
	ContactPojo contactpojo=new ContactPojo();

	public int displayMain() {

		System.out.print("1<--Add\n2<--View\n3<--Edit\n4<--Search\n5<--Delete\n6<--Sort\n7<--Quit\nEnter the number:");
		int choose = sc.nextInt();
		return choose;

	}

	public ContactPojo addName() {
		System.out.println("\n");
		System.out.println("-------------------ADD CONTACT-----------------------");

		ContactPojo contactpojo = new ContactPojo();

		System.out.print("Enter the FirstName:");
		String firstName = sc.next();
		contactpojo.setFirstName(firstName);

		System.out.print("Enter the LastName:");
		String lastName = sc.next();
		contactpojo.setLastName(lastName);

		return contactpojo;

	}

	public ContactPojo addNumber() {
		
		ContactView contactview = new ContactView();

		ContactPojo contactpojo = new ContactPojo();
		boolean b;
		
		do{
			
		System.out.print("Enter the Number:");
		String number=sc.next();
		sc.nextLine();
		
		if("".equals(number)){
			return contactpojo;
		}
		if (b = contactview.doNumberValidation(number)) {
		contactpojo.setNumber(number);
		} else {
			System.out.println("Enter a valid Number.");
		}
	} while (!b);
		
		return contactpojo;
	}


	public ContactPojo addEmail() {

		ContactView contactview = new ContactView();

		ContactPojo contactpojo = new ContactPojo();
		boolean b;

		do {
			System.out.print("Enter the Email:");
			String email = sc.next();
			if (b = contactview.doEmailValidation(email)) {
				contactpojo.setEmail(email);
			} else {
				System.out.println("Enter a valid email ID.");
			}
		} while (!b);

		return contactpojo;

	}

	public void viewContact(Contact contact) {
		contact.getContact();

	}

	/*
	 * public void viewContact(ContactMain contactmain) {
	 * System.out.println(contactmain);
	 * 
	 * }
	 */

	public void searchAContact(Contact contact, ContactMain contactmain) {

		System.out.print("Enter the Name you want to search:");
		String searchName = sc.next();
		contact.getSearchContact(searchName, contactmain);
		// if(searchName.equals())

	}

	public void removeAContact(Contact contact, ContactMain contactmain) {
		System.out.print("Enter the Name you want to remove:");
		String removeName = sc.next();
		contact.getRemoveContact(removeName, contactmain);

	}

	public void sort(Contact contact) {

		contact.sortContact();

	}

	public void editContact(ContactView contactview,Contact contact, ContactMain contactmain) {
		System.out.print("Enter the Name you want to edit:");
		String editName = sc.next();
		contact.getEditContact(contactview,editName, contactmain);

	}

	public boolean doEmailValidation(String email) {
		boolean b = true;
		char[] ch = email.toCharArray();
		if ((ch[0] > 31 && ch[0] < 48) || (ch[0] > 57 && ch[0] < 65) || (ch[0] > 90 && ch[0] < 97))
			b = false;
		for (char bad : ch) {
			if ((bad > 31 && bad < 46) || (bad > 57 && bad < 64) || (bad > 90 && bad < 97)) {
				b = false;
				break;
			}
		}
		boolean b1 = email.contains("@.");
		boolean b2 = email.contains(".@");
		boolean b4 = email.contains("..");
		int ind1 = email.lastIndexOf('.');
		int ind2 = email.lastIndexOf('@');
		String[] valid = email.split("@");
		if (b1) {
			b = false;
		} else if (b2) {
			b = false;
		} else if (valid.length > 2) {
			b = false;
		} else if (ind1 <= 0 || ind2 <= 0 || ind1 == email.length() - 1) {
			b = false;
		} else if (ind1 < ind2) {
			b = false;
		} else if (b4) {
			b = false;
		}
		return b;
	}
	

	boolean doNumberValidation(String number) {
		boolean b = false;
		char[] ch = number.toCharArray();
		if(number.length()==14){
			if(ch[0]=='+'){
				if(ch[3]=='-'){
					for (char bad : ch) {
						if (((bad=='0' || bad=='1' || bad=='2' || bad=='3' || bad=='4' || bad=='5' || bad=='6' || bad=='7' || bad=='8' || bad=='9') || bad==43 || bad==45)) {
							b = true;
						}
						else{
							b=false;
							break;
						}	
					}
					
				}
				else{
					b=false;
				
				}	
			}
			else{
				b=false;
			
			}	
		}
		
		else if(number.length()==10){
			for (char bad : ch) {
				if ((bad=='0' || bad=='1' || bad=='2' || bad=='3' || bad=='4' || bad=='5' || bad=='6' || bad=='7' || bad=='8' || bad=='9')) {
					b = true;
				}
				else{
					b=false;
					break;
				}	
			}
			
		}
		else
			b=false;
		return b;
		
	}

}
