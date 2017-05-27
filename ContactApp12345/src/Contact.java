import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Contact {

	List<ContactMain> list = new ArrayList<>();
	// Contact contact=new Contact();t9g

	Map<Integer, ContactMain> map = new LinkedHashMap<>();

	private Scanner sc = new Scanner(System.in);

	// int index=1;
	public void addContact(ContactMain contactmain) {
		list.add(contactmain);
		// System.out.println(list.contains());
		// System.out.println(list.get(0));
		// map.put(index, cm);
		// ++index;
	}

	public void getContact() {

		for (ContactMain number : list) {
			// System.out.println(number);
			System.out.println("FirstName: " + number.getNameList().getFirstName());
			System.out.println("LastName: " + number.getNameList().getLastName());
			System.out.println(number.getNumberlist().toString().replace("{", "").replace("}", "").replace("[", "")
					.replace("]", ""));
			System.out.println(number.getEmaillist().toString().replace("{", "").replace("}", "").replace("[", "")
					.replace("]", ""));
		}

		/*
		 * for (Entry<Integer, ContactMain> entry : map.entrySet()) {
		 * System.out.println("Index = " + entry.getKey() + ", Contact = " +
		 * entry.getValue()); }
		 */
	}

	public void getSearchContact(String searchName, ContactMain contactmain) {
		// int t = 0;
		// ContactMain temp = null;
		boolean flag = false;
		for (ContactMain temp : list) {
			// ++t;
			if (searchName.equals(temp.getNameList().getFirstName().substring(0, (searchName.length())))) {
				System.out.println(temp.getNameList().getFirstName() + "\n" + temp.getNameList().getLastName() + "\n"
						+ temp.getNumberlist() + "\n" + temp.getEmaillist());
				flag = true;
				// break;
			}
			// } else if (t == list.size()) {
			// System.out.println("There is no contact in this name.");
			// break;
			// }
		}
		if (!flag)
			System.out.println("There is no contact in this name.");
		// System.out.println(temp.getNameList().getFirstName() + "\n" +
		// temp.getNameList().getLastName() + "\n"
		// + temp.getNumberlist() + "\n" + temp.getEmaillist());
	}

	public void getRemoveContact(String removeName, ContactMain contactmain) {
		int t = 0;
		boolean flag = false;
		List<ContactMain> temp = new ArrayList<ContactMain>();
		for (ContactMain r : list) {
			if (removeName.equals(r.getNameList().getFirstName())) {
				++t;
				temp.add(r);
				System.out.println(t + "." + r.getNameList().getFirstName());
				// System.out.println("Contact removed sucessfully.");
				flag = true;
				// break;
			}
		}
		if (!flag) {
			System.out.println("There is no contact in this name.");
		}
		if (flag) {
			System.out.print("Enter the number you want to delete:");
			int n = sc.nextInt();
			list.remove(temp.get(n - 1));

		}

		//list.remove(temp);
	}

	public void sortContact() {
		Collections.sort(list);

	}

	/*
	 * private void sort(List<ContactMain> list) { for (int i = 0; i <
	 * list.size(); i++) {
	 * 
	 * for (int j = list.size() - 1; j > i; j--) { // for (ContactMain r : list)
	 * { if (list.get(i).getNameList().getFirstName().compareTo(list.get(j).
	 * getNameList().getFirstName())) {
	 * 
	 * ContactMain tmp = list.get(i); list.set(i,list.get(j)) ; list.set(j,tmp);
	 * //} }
	 * 
	 * }
	 * 
	 * } for (int i: list) { System.out.println(i); }
	 * 
	 * }
	 */

	public void getEditContact(ContactView contactview, String editName, ContactMain cm) {

		sc = new Scanner(System.in);
		int t = 0;
		++t;
		System.out.println("1.FirstName\n2.LastName\n3.Number\n4.AlterNumber\n5.EmailID\n6.AlterEmailID");
		int choose = sc.nextInt();
		boolean b;
		for (ContactMain r : list) {
			if (editName.equals(r.getNameList().getFirstName())) {
				switch (choose) {
				case 1:
					System.out.print("Enter the FirstName:");
					String firstName = sc.next();
					r.getNameList().setFirstName(firstName);
					break;
				case 2:
					System.out.print("Enter the LastName:");
					String lastName = sc.next();
					r.getNameList().setLastName(lastName);
					break;
				case 3:
					do {
						System.out.print("Enter the Number");
						String number = sc.next();

						if (b = contactview.doNumberValidation(number)) {
							r.getNumberlist().put("Number", new LinkedHashSet<>());
							r.getNumberlist().get("Number").add(number);
							System.out.println("Contact updated sucessfully.");
							break;
						} else {
							System.out.println("Enter a valid number.");
						}
					} while (!b);
					break;
				case 4:
					do {
						System.out.print("Enter the AlterNumber:");
						String alterNumber = sc.next();

						if (b = contactview.doNumberValidation(alterNumber)) {
							r.getNumberlist().put("AlternateNumber", new LinkedHashSet<>());
							r.getNumberlist().get("AlternateNumber").add(alterNumber);
							System.out.println("Contact updated sucessfully.");
							break;
						} else {
							System.out.println("Enter a valid number.");
						}
					} while (!b);
					break;
				case 5:
					do {
						System.out.print("Enter the Email:");
						String email = sc.next();

						if (b = contactview.doEmailValidation(email)) {
							r.getEmaillist().put("EmailID", new LinkedHashSet<>());
							r.getEmaillist().get("EmailID").add(email);
							System.out.println("Contact updated sucessfully.");
							break;
						} else {
							System.out.println("Enter a valid number.");
						}
					} while (!b);
					break;
				case 6:
					do {
						System.out.print("Enter the AlterEmail:");
						String alterEmail = sc.next();

						if (b = contactview.doEmailValidation(alterEmail)) {
							r.getEmaillist().put("AlternateEmailID", new LinkedHashSet<>());
							r.getEmaillist().get("AlternateEmailID").add(alterEmail);
							System.out.println("Contact updated sucessfully.");
							break;
						} else {
							System.out.println("Enter a valid number.");
						}
					} while (!b);
					break;
				}
			} else if (t == list.size()) {
				System.out.println("There is no contact in this name.");
				break;
			}

		}

	}

}
