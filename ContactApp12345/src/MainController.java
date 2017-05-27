import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class MainController {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		MainController maincontroller = new MainController();
		ContactView contactview = new ContactView();
		ContactMain contactmain = new ContactMain();
		Contact contact = new Contact();

		do {
			int choose = contactview.displayMain();
			switch (choose) {
			case 1:
				maincontroller.add(contactview, contact);
				break;
			case 2:
				maincontroller.view(contactview, contact, contactmain);
				break;
			case 3:
				maincontroller.edit(contactview, contact, contactmain);
				break;
			case 4:
				maincontroller.search(contactview, contact, contactmain);
				break;

			case 5:
				maincontroller.remove(contactview, contact, contactmain);
				break;
			case 6:
				contactview.sort(contact);
				break;
			case 7:
				System.exit(0);
				break;
			}

		} while (true);
	}

	private void remove(ContactView contactview, Contact contact, ContactMain contactmain) {
		contactview.removeAContact(contact, contactmain);

	}

	private void search(ContactView contactview, Contact contact, ContactMain contactmain) {
		contactview.searchAContact(contact, contactmain);

	}

	public void edit(ContactView contactview, Contact contact, ContactMain contactmain) {

		contactview.editContact(contactview, contact, contactmain);

	}

	private void view(ContactView contactview, Contact contact, ContactMain contactmain) {
		contactview.viewContact(contact);
		// cv.viewContact(cm);
	}

	private void add(ContactView contactview, Contact contact) {

		ContactMain cm = new ContactMain();

		cm.setNameList(contactview.addName());
		cm.setNumberlist(getNumber(contactview));
		cm.setEmaillist(getEmail(contactview));
		System.out.print("If you want to summit the contact type 'yes', else 'No':");
		String choose = sc.next();
		if ("yes".equals(choose)) {
			contact.addContact(cm);
			contact.sortContact();
			System.out.println("Contact is added sucessfully.");
		} else
			System.out.println("Contact is not added");
	}

	public Map<String, LinkedHashSet<String>> getNumber(ContactView contactView) {

		Map<String, LinkedHashSet<String>> phoneSet = new HashMap<String, LinkedHashSet<String>>();
		// LinkedHashSet<String> phoneSet = new LinkedHashSet<>();
		String choose;
		int t = 0;
		do {
			++t;// phoneset.get("main").remove(num);
				// phoneset.et(main).add(newnum);
			ContactPojo phoneNumber = contactView.addNumber();
			if (t == 1) {
				phoneSet.put("Number", new LinkedHashSet<>());
				phoneSet.get("Number").add(phoneNumber.getNumber());
			} else if (t == 2) {
				phoneSet.put("AlternateNumber", new LinkedHashSet<>());
				phoneSet.get("AlternateNumber").add(phoneNumber.getNumber());
			}
			if (t <= 1) {
				System.out.println("If you want to add one more number press 'yes', else 'no'.");
				choose = sc.next();
			} else
				choose = "no";
		} while ("yes".equals(choose));

		return phoneSet;
	}

	public Map<String, LinkedHashSet<String>> getEmail(ContactView contactView) {

		Map<String, LinkedHashSet<String>> emailSet = new HashMap<String, LinkedHashSet<String>>();
		// LinkedHashSet<String> emailSet = new LinkedHashSet<>();
		String choose;
		int t = 0;
		do {
			++t;
			ContactPojo email = contactView.addEmail();
			if (t == 1) {
				emailSet.put("EmailID", new LinkedHashSet<>());
				emailSet.get("EmailID").add(email.getEmail());
			} else if (t == 2) {
				emailSet.put("AlternateEmailID", new LinkedHashSet<>());
				emailSet.get("AlternateEmailID").add(email.getEmail());
			}
			if (t < 2) {
				System.out.println("If you want to add one more email press 'yes', else 'no'.");
				choose = sc.next();
			} else
				choose = "no";
		} while ("yes".equals(choose));

		return emailSet;
	}

}
