package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact_service.Contact;
import contact_service.ContactService;

class ContactServiceTest {

	@Test
	void testContactService() {
		ContactService.CreateContact("remId");
		ContactService.CreateContact("12345");
		assertTrue(ContactService.contacts.get(1).getId().equals("12345"));
		
		Contact RemContact = ContactService.contacts.get(0);
		ContactService.RemoveContact(RemContact);
		assertTrue(ContactService.contacts.get(0).getId().equals("12345"));
		
		ContactService.UpdateContact("12345", "updated", "updated", "updated000", "updated");
		assertTrue(ContactService.contacts.get(0).getId().equals("12345"));
		assertTrue(ContactService.contacts.get(0).getFirstName().equals("updated"));
		assertTrue(ContactService.contacts.get(0).getLastName().equals("updated"));
		assertTrue(ContactService.contacts.get(0).getPhone().equals("updated000"));
		assertTrue(ContactService.contacts.get(0).getAddress().equals("updated"));
	}

}
