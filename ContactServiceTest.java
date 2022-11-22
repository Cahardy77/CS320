import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class ContactServiceTest {

	@Test
	void testContactServiceClass() {
		ContactService conServ = new ContactService();
		conServ.addContact("321","john","potato","507","2601");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{conServ.updateFirst("321", "According to all known");});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{conServ.updateLast("321", "According to all known");});


		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{conServ.updatePhone("321", "According to all known");});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{conServ.updateAddress("321", "According to all known laws of aviation, there is no way a bee should be able to fly.");});
		
		conServ.updateFirst("321", "Chris");
		conServ.updateLast("321", "Hardy");
		conServ.updatePhone("321", "218");
		conServ.updateAddress("321", "507");
		conServ.deleteContact("321");
	}

}
