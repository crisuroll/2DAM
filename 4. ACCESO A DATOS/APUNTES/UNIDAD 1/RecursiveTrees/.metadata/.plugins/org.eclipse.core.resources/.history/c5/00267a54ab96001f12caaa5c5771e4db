import java.util.HashMap;

public class PhoneBook {
	
	private HashMap<String, Integer> contacts;
	
	public PhoneBook() {
		this.contacts = new HashMap<>();
	}
	
	// Add/Update Contact
	public void putContact(String _name, Integer _num) {
		if (!this.contacts.containsKey(_name)) {
			this.contacts.put(_name, _num);
			System.out.println("Contact added successfully.");
		} else {
			this.contacts.put(_name, _num);
			System.out.println("Contact updated successfully.");
		}
	}
	
	// Delete Contact
	public void deleteContact(String _name) {
		if (!this.contacts.containsKey(_name)) {
			System.out.println("This contact doesn't exist.");
		} else {
			this.contacts.remove(_name);
			System.out.println("Contact deleted successfully.");
		}
	}
	
	// Search Contact
	public void searchContact(String _name) {
		if (!this.contacts.containsKey(_name)) {
			System.out.println("This contact doesn't exist.");
		} else {
			System.out.println(_name + "'s number is: " + contacts.get(_name));
		}
	}
	
	// List All Contacts
	public void listAllContacts () {
        if (this.contacts.isEmpty() == true) {
            System.out.println("No hay contactos");
        }else {
            for(String a : contacts.keySet()) {
                System.out.println(a + ": "  + contacts.get(a));
            }
        }

    }

}

