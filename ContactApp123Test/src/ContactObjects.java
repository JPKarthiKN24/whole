

import java.util.Scanner;


public class ContactObjects {

	public Contact printContact() {
		// TODO Auto-generated constructor stub

		@SuppressWarnings("resource")
		Scanner en = new Scanner(System.in);
		int choice;
		String isValid = "";

		Contact contact = new Contact();

		do {
			System.out.println("1.Name 2.mobile 3.Email 4.Address");
			choice = en.nextInt();
			switch (choice) {
			case 1:
				ContactName contactname = new ContactName();
				Name name = contactname.printName();
				contact.setName(name);
				break;

			case 2:
				ContactMobile contactmobile = new ContactMobile();
				Mobile mobile = contactmobile.printMobile();
				contact.setMobile(mobile);
				break;

			case 3:
				ContactEmail contactemail = new ContactEmail();
				Email mail = contactemail.printEmail();
				contact.setEmail(mail);
				break;

			case 4:
				ContactAddress contactaddress = new ContactAddress();
				Address address = contactaddress.printAddress();
				contact.setAddress(address);
				break;
			// Default: System.out.println("Give correct Choice ");
			}
			System.out.println("Do you want to add another Contact fileds ->  yes");
			en.nextLine();
			isValid = en.nextLine();
		} while (isValid.equals("yes"));

		//System.out.println(contact);
		return contact;
	}

}
