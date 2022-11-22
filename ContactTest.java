

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	@Test
	void testCreateNew() {
		Contact newContact = new Contact("321","chris","Hardy","218","1776");
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{Contact newContact1 = new Contact("01234567890","chris","Hardy","218","1776");});

	}
	
	
	@Test
	void testFirstName() {
		Contact newContact = new Contact("321","chris","Hardy","218","1776");
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{newContact.updateFirstName("123456789654987");});
	}
	
	@Test
	void testLastName() {
		Contact newContact = new Contact("321","chris","Hardy","218","1776");
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{newContact.updateLastName("123456789654987");});
	}
	
	@Test
	void testPhone() {
		Contact newContact = new Contact("321","chris","Hardy","218","1776");
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{newContact.updatePhone("123456789654987");});
	}
	
	@Test
	void testAddress() {
		Contact newContact = new Contact("321","chris","Hardy","218","1776");
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{newContact.updateAddress("According to all known laws of aviation, there is no way a bee should be able to fly.");});
	}
}
