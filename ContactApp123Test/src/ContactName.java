

import java.util.Scanner;



public class ContactName {

	public Name printName() {
		Name name = new Name();
		String FirstName;
		String LastName;
		String MiddleName;
		String NickName;

		@SuppressWarnings("resource")
		Scanner en = new Scanner(System.in);
		System.out.println("FirstName :");
		FirstName = en.nextLine();
		System.out.println("MiddleName :");
		MiddleName = en.nextLine();
		System.out.println("LastName :");
		LastName = en.nextLine();
		System.out.println("NickName :");
		NickName = en.nextLine();
		name.setFirstName(FirstName);
		name.setMiddleName(MiddleName);
		name.setLastName(LastName);
		name.setNickName(NickName);

		return name;
	}

}
