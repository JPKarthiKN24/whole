

import java.util.Scanner;



public class ContactAddress {

	public Address printAddress() {
		Address address = new Address();
		@SuppressWarnings("resource")
		Scanner en = new Scanner(System.in);
		String type = "";
		System.out.println("Address ID: ");
		String contactAddress = en.nextLine();
		en.nextLine();

		System.out.println("Give your choice for Type -> 1.Home 2.Office");
		int choice = en.nextInt();
		switch (choice) {
		case 1:
			type = "personal";
			break;
		case 2:
			type = "Office";
			break;
		}

		address.setAddress(contactAddress);
		address.settype(type);
		address.getAddressMap().put(contactAddress, type);
		return address;

	}

}
