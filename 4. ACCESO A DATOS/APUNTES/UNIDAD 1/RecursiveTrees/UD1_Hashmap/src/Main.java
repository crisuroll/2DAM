import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int op = 0;
		String name="";
		PhoneBook contacts = new PhoneBook();
		
		// MENÚ
		
		do {
			System.out.println("--- Phone Book Menu ---\n"
					+ "1. Add/Update Contact\n"
					+ "2. Delete Contact\n"
					+ "3. Search Contact\n"
					+ "4. List All Contacts\n"
					+ "5. Exit\n"
					+ "Enter your choice: ");
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("Enter contact name: ");
					name = sc.nextLine();
					System.out.println("Enter phone number: ");
					Integer num = sc.nextInt();
					contacts.putContact(name, num);
				break;
				case 2:
					System.out.println("Enter contact name to delete: ");
					name = sc.nextLine();
					contacts.deleteContact(name);
				break;
				case 3:
					System.out.println("Enter contact name to search: ");
					name = sc.nextLine();
					contacts.searchContact(name);
				break;
				case 4:
					contacts.listAllContacts();
				break;
				case 5:
					System.out.println("Exiting Phone Book.");
				break;
			}
			
		} while (op != 5);

	}

}
