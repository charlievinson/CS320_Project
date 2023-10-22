package contact_service;

import java.util.ArrayList;

public class ContactService {
	public static ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public static void AddContact(Contact contact) {
		contacts.add(contact);
	}
	
	public static void RemoveContact(Contact targetContact) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getId().equals(targetContact.getId())) {
				contacts.remove(i);
			}
		}
	}
	
	public static void CreateContact(String id) {
		Contact NewContact = new Contact(id, "firstname", "lastname", "phonephone", "address");
		AddContact(NewContact);
	}
	
	public static void UpdateContact(String id, String firstName, String lastName, String phone, String address) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getId().equals(id)) {
				Contact tempContact = contacts.get(i);
				tempContact.setFirstName(firstName);
				tempContact.setLastName(lastName);
				tempContact.setPhone(phone);
				tempContact.setAddress(address);
			}
		}
	}
	
	
	
	
}
