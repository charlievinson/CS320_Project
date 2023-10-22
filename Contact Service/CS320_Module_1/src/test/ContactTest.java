package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact_service.Contact;

class ContactTest {

	@Test
	void testContactClass() {
		Contact ContactClass = new Contact("12345", "firstname", "lastname", "1234567890", "address");
		assertTrue(ContactClass.getId().equals("12345"));
		assertTrue(ContactClass.getFirstName().equals("firstname"));
		assertTrue(ContactClass.getLastName().equals("lastname"));
		assertTrue(ContactClass.getPhone().equals("1234567890"));
		assertTrue(ContactClass.getAddress().equals("address"));
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123451234512345", "firstname", "lastname", "1234567890", "address");
		});
	}
	
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "firstname", "lastname", "1234567890", "address");
		});
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "firstnamefirstname", "lastname", "1234567890", "address");
		});
	}
	
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", null, "lastname", "1234567890", "address");
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "firstname", "lastnamelastname", "1234567890", "address");
		});
	}
	
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "firstname", null, "1234567890", "address");
		});
	}
	
	@Test
	void testContactPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "firstname", "lastname", "12345678901", "address");
		});
	}
	
	@Test
	void testContactPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "firstname", "lastname", "123456789", "address");
		});
	}
	
	@Test
	void testContactPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "firstname", "lastname", null, "address");
		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "firstname", "lastname", "1234567890", "1234567890 1234567890 1234567890");
		});
	}
	
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "firstname", "lastname", "1234567890", null);
		});
	}

}
