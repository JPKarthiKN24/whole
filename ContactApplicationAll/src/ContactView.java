
import java.util.Scanner;


public class ContactView {

	
	Scanner sc = new Scanner(System.in);
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private Scanner sc2;

	/*public void add() {
		int a,b;
		System.out.print("Enter Name:");
		String name = sc.next();
		
		do {
			System.out.println("1<--num 2<--email");
			 b = sc.nextInt();
			if (b == 1) {
				System.out.println("Enter the number");
				String num = sc.next();
				
			} else if (b == 2) {
				System.out.println("Enter the EmailID");
				String email = sc.next();
				s2.add(email);
			}
			System.out.println("want to add more num and mailid press -->1");
			a = sc.nextInt();
		} while (a == 1);

	}*/

	public NameContact addName(){
		
		NameContact nc=new NameContact();
		
		System.out.print("Enter Firstname:");
		String firstName=sc.next();
		//sc.nextLine();
		nc.setFirstName(firstName);
		System.out.print("Enter Lastname:");
		String lastName=sc.next();
		sc.nextLine();
		nc.setLastName(lastName);
		
		return nc;	
	}
	
	public phoneContact addPhone(){
		
		phoneContact pc=new phoneContact();
		System.out.print("Enter PhoneNumber:");
		String phoneNumber=sc.next();
		pc.setPhoneNumber(phoneNumber);
		System.out.print("Enter PhoneNumberType:");
		String phoneNumberType=sc.next();
		pc.setPhoneNumberType(phoneNumberType);
		
		return pc;
	}
	
	public EmailContact addEmail() {
		
		EmailContact ec=new EmailContact();
		System.out.print("Enter EmailID:");
		String eMail=sc.next();
		ec.setEmail(eMail);
		System.out.print("Enter EmailIDType:");
		String eMailType=sc.next();
		ec.setEmailType(eMailType);
		
		return ec;
	}
	
	public int displayMainMenu(){
		
		sc2 = new Scanner(System.in);
		System.out.print("1<--Add 2<--Edit 3<--View 4<--Search by index 5<--Search 6<--Delete 7<--Sort 8<--Quit");
	    int r=sc2.nextInt();
	   //s sc.close();
	    return r;
	}

	public int printContactList(Contacts c) {
		
		if (c.isEmpty()) {
			System.out.println("Contact list is empty");
			return -1;
		}

		else {
			for (int i = 0; i < c.getLength(); i++) {
				System.out.println(" ( " + (i + 1) + " ) " + c.getContact(i).getNameList().getFirstName());
			}

			System.out.println("\n\nEnter the index number of the contact");
			return sc.nextInt() - 1;
		}
	}

	public void printContact(Contacts c) {
		
		/*out.println("First Name    : " + contact.getNameList().getFirstName());
		
		out.println("Last Name     : " + contact.getNameList().getLastName());
		
		out.println("\nPhone Numbers ");
		out.println("-------------");

		for (Map.Entry<String, LinkedHashSet<String>> entry : contact.getPhoneNumberList().entrySet()) {

			for (String i : entry.getValue())
				out.println(entry.getKey() + " : " + i);
		}

		out.println("\nEmails ");
		out.println("-------");

		for (Map.Entry<String, LinkedHashSet<String>> entry : contact.getEmailList().entrySet()) {

			for (String i : entry.getValue())
				out.println(entry.getKey() + " : " + i);

		}
		*/
		//System.out.println(c);
		c.getContact();
	}
	public void printContact(ContactList cl) {
		System.out.println(cl);
	}

}
