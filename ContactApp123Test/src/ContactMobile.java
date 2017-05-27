

import java.util.Scanner;



public class ContactMobile {

	public Mobile printMobile() {
		Mobile mobile = new Mobile();
		@SuppressWarnings("resource")
		Scanner en = new Scanner(System.in);
		System.out.println("Moible number :");
		Long mobilenumber = en.nextLong();
		String type = "";

		System.out.println("Give your choice for Type -> 1.Personal 2.Home 3.Office");
		int choice = en.nextInt();
		switch (choice) {
		case 1:
			type = "personal";
			break;
		case 2:
			type = "Home";
			break;
		case 3:
			type = "Office";
			break;
		}

		mobile.setMobilenumber(mobilenumber);
		mobile.settype(type);
		mobile.getMobileno().put(mobilenumber, type);

		return mobile;

	}

}
