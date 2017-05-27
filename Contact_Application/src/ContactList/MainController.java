package ContactList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainController {

	public static void main(String args[]) {
		ContactView cv = new ContactView();
		Scanner sc = new Scanner(System.in);
		String option = "";

		List<Contact> list = new ArrayList<Contact>();
		do {
			list.add(cv.printContact());
			option = cv.getOption();
		} while (option.equals("1"));

		Iterator<Contact> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		sc.close();

	}

}
