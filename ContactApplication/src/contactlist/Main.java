package contactlist;

import java.util.*;

import contactlist.Contact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	List<Contact> contactlist = new ArrayList<>();

	public static void main(String[] args) throws Exception {

		Main list = new Main():

		list.addContactNames();
		list.addContactNumber();
		list.addContactEmail();
		list.addContactAddress();

	}

	public Main() {
		this.contactlist = new ArrayList<>();
	}

	public void addContactNames() throws IOException {
		Set<String> sss = new HashSet<String>();
		String firstName = "";
		String middleName = "";
		String lastName = "";
		BufferedReader keyIn;
		keyIn = new BufferedReader(new InputStreamReader(System.in));
		firstName = Boolean.toString(sss.add(keyIn.readLine()));
		middleName = Boolean.toString(sss.add(keyIn.readLine()));
		lastName = Boolean.toString(sss.add(keyIn.readLine()));

		ContactName cn = new ContactName(firstName, middleName, lastName);

	}

	public void addContactNumber() throws IOException {

		Map<String, Set<String>> map = new HashMap<String, Set<String>>();

		BufferedReader keyIn;
		keyIn = new BufferedReader(new InputStreamReader(System.in));

		Set<String> set = new HashSet<String>();

		System.out.println("Number of numbers do u want 2 save : ");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		String number = "";
		Set<String> numberName;

		for (int i = 1; i <= choose; i++) {
			System.out.println("Enter the " + i + " number : ");
			number = Boolean.toString(set.add(keyIn.readLine()));
		}
		System.out.println(set);

		System.out.println("Home or Personal or Office");
		numberName = map.put(keyIn.readLine(), set);
		System.out.println(map);

		ContactNumber conNum = new ContactNumber(number, numberName);
		contactlist.add(conNum);

		conNum.write();

	}

	public void addContactEmail() throws IOException {
		Map<String, Set<String>> map = new HashMap<String, Set<String>>();

		Set<String> set = new HashSet<String>();

		BufferedReader keyIn;
		keyIn = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Number of emails do u want 2 save : ");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();

		for (int i = 1; i <= choose; i++) {
			System.out.println("Enter the " + i + " Email : ");
			set.add(keyIn.readLine());
		}
		System.out.println(set);

		System.out.println("Personal or Office");
		map.put(keyIn.readLine(), set);
		System.out.println(map);

		ContactEmail conNum1 = new ContactEmail(number, numberName);
		contactlist.addAll(conNum1);

		conNum1.write();

	}

}
