package contactlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {

		String name;
		String numberType;
		String number;
		String email;
		String address;

		Contact c = new Contact();

		List<Contact> list = new ArrayList<Contact>();

		ContactView cv = new ContactView();

		Scanner en = new Scanner(System.in);
		String option = "";

		int t = cv.showFirstMessage();
		do {
			switch (t) {
			case 1:
				list.add(cv.getContact());
				name = cv.getName();
				numberType = cv.getNumberType();
				number = cv.getNumber();
				email = cv.getemail();
				address = cv.getAddress();

				c.setName(name);
				c.setNumberType(numberType);
				c.setNumber(number);
				c.setEmailId(email);
				c.setAddress(address);
				;
				break;
			case 2:
				//mc.viewContact();
			}
			t = cv.showFirstMessage();
		} while (t == 1);

	}

}
