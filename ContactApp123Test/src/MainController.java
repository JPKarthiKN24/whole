

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class MainController {

	public static void main(String args[]) {
		ContactObjects contactobjects = new ContactObjects();
		Scanner en = new Scanner(System.in);
		String option = "";

		List<Contact> list = new ArrayList<Contact>();
		do {
			list.add(contactobjects.printContact());
			System.out.println("If you want add one more CONTACT -> yes ");
			option = en.nextLine();
		} while (option.equals("yes"));

		Iterator<Contact> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		en.close();

	}

}
