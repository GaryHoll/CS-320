//Test Class 
//Tests the "Contact" class for input verification for ID,first name, last name, address, and phone

            
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import app.Contact;

class contactTest {

	//Tests to make sure that the data from the added object is added correctly
	@Test
	void testContact() {
		Contact contact = new Contact("10001","Jim","Bob","5252355569","601 New Port Way");
		assertTrue(contact.getID().equals("10001"));
		assertTrue(contact.getFirstName().equals("Jim"));
		assertTrue(contact.getLastName().equals("Bob"));
		assertTrue(contact.getPhone().equals("5252355569"));
		assertTrue(contact.getAddress().equals("601 New Port Way"));
	}
	//Tests for an ID that is too long
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("10001000000000123", "Gary", "Bob", "5252355569","601 New Port Way");
		});	
		}
	//Test is First Name is too long
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("10001", "GaraldHiggalyboo", "Bob", "5252355569","601 New Port Way");
		});	
		}
	//Tests if Last Name is too long
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("10001", "Jim", "BobbbyyyRadioStar", "5252355569","601 New Port Way");
		});	
		}
	//Tests if Address is too long
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("10001", "Jim", "Bob", "5252355569","601 New Port Way Fort Worth Texas United States of America");
		});	
		}
	//Tests if phone is not 10 digets
	@Test
	void testContactPhoneNot10() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("10001", "Jim", "Bob", "52523555692","601 New Port Way");
		});	
		}
}
