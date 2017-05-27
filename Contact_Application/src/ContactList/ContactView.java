package ContactList;

import java.util.Scanner;

public class ContactView {
	Scanner sc = new Scanner(System.in);
	private Scanner sc2;
	private Scanner sc3;
	private Scanner sc4;
	private Scanner sc5;
	private Scanner sc6;

	public String getOption() {

		System.out.println("If you want add next field -> 1 ");
		String option = sc.next();
		return option;
	}

	public Contact printContact() {

		int choice;
		String isValid = "";
		String s;

		Contact contact = new Contact();
		do {
			System.out.println("1<--Add Contact 2<--View Contact 3<--Quit");
			int t = sc.nextInt();
			switch (t) {

			case 1:
				do {
					System.out.println("1<--Name 2<--mobile 3<--Email 4<--Address 5<--DateOfBirth");
					choice = sc.nextInt();
					switch (choice) {
					case 1:
						String name = getName();
						contact.setName(name);
						break;

					case 2:
						MobileNumber mobile = getMobile();
						contact.setMobile(mobile);
						break;

					case 3:
						UserMail mail = getEmail();
						contact.setEmail(mail);
						break;

					case 4:
						UserAddress address = getAddress();
						contact.setAddress(address);
						break;

					case 5:
						UserDOB dob = getDob();
						contact.setDob(dob);
						break;

					}
					System.out.println("If you want to add other fields -> 1 ");
					isValid = sc.next();
				} while (isValid.equals("1"));
				break;

			case 2:
			}
			System.out.println("If you want to continue -> 1 ");
			s = sc.next();
		} while (s == "1");
		return contact;
	}

	public String getName() {
		UserName namee = new UserName();
		String name;
		sc2 = new Scanner(System.in);
		System.out.println("FirstName :");
		name = sc2.next();
		namee.setName(name);

		return name;
		
	}

	public MobileNumber getMobile() {
		MobileNumber mobile = new MobileNumber();
		System.out.println("MobileNumber :");
		sc3 = new Scanner(System.in);
		String type = "";
		String isValid = "";
		do {

			String MobileNumber = sc3.next();

			System.out.println("Give your choice for Type -> 1<--personal 2<--General 3<--Office");
			int choice = 0;

			try {
				choice = Integer.parseInt(sc3.next());
			} catch (NumberFormatException e) {

			}
			switch (choice) {
			case 1:
				type = "personal";
				break;
			case 2:
				type = "General";
				break;
			case 3:
				type = "Office";
				break;
			}

			mobile.setMobileNumber(MobileNumber);
			mobile.settype(type);
			mobile.getMapmobile().put(MobileNumber, type);
			sc3.nextLine();
			System.out.println("You like to ADD one more mobilenumber : -->1 ");
			isValid = sc3.nextLine();
		} while (isValid.equals("1"));
		return mobile;
	}

	public UserMail getEmail() {
		UserMail email = new UserMail();
		System.out.println("Email :");
		sc4 = new Scanner(System.in);
		String type = "";
		String isValid = "";
		do {

			String mail = sc4.nextLine();
			// en.nextLine();

			System.out.println("Give your choice for Type --> 1<--personal 2<--General 3<--Office");
			int choice = 0;

			try {
				choice = Integer.parseInt(sc4.nextLine());
			} catch (NumberFormatException e) {

			}
			switch (choice) {
			case 1:
				type = "personal";
				break;
			case 2:
				type = "General";
				break;
			case 3:
				type = "Office";
				break;
			}

			email.setEmail(mail);
			email.settype(type);
			email.getMapMail().put(mail, type);
			sc4.nextLine();
			System.out.println("You like to ADD one more Email : -->1 ");
			isValid = sc4.nextLine();
		} while (isValid.equals("1"));
		return email;
	}

	public UserAddress getAddress() {
		UserAddress address = new UserAddress();
		sc5 = new Scanner(System.in);
		String type = "";
		System.out.println("Address ID: ");
		String contactAddress = sc5.next();
		System.out.println("Give your choice for Type -> 1<--Home 2<--Office");
		int choice = sc5.nextInt();
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

	public UserDOB getDob() {
		UserDOB dob = new UserDOB();
		String dateOfBirth;
		sc6 = new Scanner(System.in);
		System.out.println("DateOfBirth :");
		dateOfBirth = sc6.next();
		dob.setDob(dateOfBirth);
		return dob;
		
	}
}