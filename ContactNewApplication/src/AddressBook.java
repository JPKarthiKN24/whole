import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private static List<Data> contact = new ArrayList<Data>();

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();


        Scanner sc = new Scanner(System.in);
        int menu;
        String choice;

        System.out.println(" 0. Exit. ");
        System.out.println(" 1. Add contact. ");
        System.out.println(" 2. Edit contact. ");
        System.out.println(" 3. Outprint contact. ");
        System.out.println(" 4. Outprint all contacts. ");
        System.out.println(" 5. Delete contact. ");
        menu = sc.nextInt();

        while (menu != 0) {

            switch (menu) {

            case 1:
                while (menu != 2) {
                    System.out.println("Enter First Name: ");
                    String firstName = sc.next();
                    System.out.println("Enter Last Name: ");
                    String lastName = sc.next();
                    System.out.println("Enter PhoneNumber: ");
                    Long phoneNumber = sc.nextLong();
                    System.out.println("Enter email: ");
                    String email = sc.next();
                    contact.add(new Data(firstName, lastName, phoneNumber, email));// Creating a new object and adding it to list
                    System.out.println("Would you like to add someone else? 1: Yes, 2: No");
                    menu = sc.nextInt();
                }
                break;

            case 2:
                System.out.println("Enter First Name of contact that you would like to edit: ");
                int index = sc.nextInt();

                break;
            case 3:
                System.out.println("Enter First Name of contact that you would like to delete: ");
                choice = sc.next();
                break;
            case 4:
                System.out.println(addressBook.contact);
                break;
            case 5:
                System.out.println("Vpišite ime osebe, ki jo želite izbrisati: ");
                choice = sc.next();
                contact.remove(choice);
                break;
            }

            System.out.println(" 0. Exit. ");
            System.out.println(" 1. Add contact. ");
            System.out.println(" 2. Edit contact. ");
            System.out.println(" 3. Outprint contact. ");
            System.out.println(" 4. Outprint all contacts. ");
            System.out.println(" 5. Delete contact. ");
            menu = sc.nextInt();
        }
        System.out.println("Goodbye!");

    }

    private void addData(String firstName, String lastName, Long phoneNumber,String email) {
        Data person = new Data(firstName, lastName, phoneNumber,email);
        contact.add(person);
    }
}