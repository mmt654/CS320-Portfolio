package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.jupiter.api.Test;

class ContactTest() {
	
	
	Contact = new contact("1", "Taylor","Murphy","123456789","101 Java st.");
	
	@Test
	
	Void getID() {
		assertEquals("1", contact.getID);
		
	}
	
	void getFirstName() {
		
		assertEquals("Taylor", contact.getFirstName);
	}
	
	void getLastName() {
		assertEquals("Murphy", contact.getLastName);
	}
	
	void getNumber() {
		assertEquals("123456789", contact.getNumber);
		
	}
	
	void getAddress() {
		assertEquals("101 Java st." contact.getAddress);
		
	}
	
	@Test 
	void testConvertString() {
		assertEquals("Contact[ ID = 1, firstName= Taylor, lastName=Murphy, number=123456789, address= 101 Java st.] " , contact.convertString());
	}
			
	
}