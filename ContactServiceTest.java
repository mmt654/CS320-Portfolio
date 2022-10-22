package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactServiceTest{
	
	@Test
	public void testGet() {
		ContactService cs = new ContactService();
		contact t1 = new Contact("1", "Taylor","Murphy","123456789","101 Java st.");
		assertEquals(true,cs.addContact(t1));
		
	}
	
	@Test
	public void testDelete() {
		
		ContactService cs = new ContactService();
		contact t1 = new contact("1", "Taylor","Murphy","123456789","101 Java st.");
		cs.addContact(t1);
		
		assertEquals(True, cs.deleteContact("1"));
	}
	
	@Test
	
	public void testUpdate() {
		ContactService cs = new ContactService();
		
		contact t1 = new contact("1", "Taylor","Murphy","123456789","101 Java st.");
		
		cs.addContact(t1);
		
		assertequals(true, cs.updateContact("First","Last","123456789","101 Java st."))
	}
}