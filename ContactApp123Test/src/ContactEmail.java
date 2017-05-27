

import java.util.Scanner;



public class ContactEmail {

	public Email printEmail() {
		Email email = new Email();
		@SuppressWarnings("resource")
		Scanner en = new Scanner(System.in);
		String type = "";
		String isValid = "";
		do {
			System.out.println("EMail ID: ");
			String mail = en.nextLine();
			//en.nextLine();

			System.out.println("Give your choice for Type -> 1.personal 2.General 3.Office");
			int choice = 0;

			try {
				choice = Integer.parseInt(en.nextLine());
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
			en.nextLine();
			System.out.println("You like to ADD one more Email : ->yes ");
			isValid = en.nextLine();
		} while (isValid.equals("yes"));
		return email;
	}
}
