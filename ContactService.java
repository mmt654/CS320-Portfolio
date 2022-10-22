package contact;

import java.util.ArrayList;

public class ContactService {
	
	private ArrayList contacts;
	
	 public contactService() {
		 
		 contact = new ArrayList<>();
	 
	 }
	 
	 public boolean addContact(contact) {
		 
		 boolean isPresent=false;
		 for(Contact contactList:contacts) {
			 if(contactList.equals(contact)) {
				 isPresent = true;
			 }
		 }
		 if(!isPresent) {
			 contact.add(contact);
			 return true;
		 }
		 else {
			 return false;
			 
		 }
	 }
	 
	 pubic boolean updateContact( String ID, String firstName, String lastName, String number, String address) {
		
		   for (Contact contactList:contacts) {
			   
			   if (contactList.getID().equals(ID)) {
				   if(!firstName.equals("")) {
				   
					   contactList.setFirstName(firstName);
				   }
				   if(!lastName.equals("")) {
					   
					   contactList.setFirstName(lastName);
				   }
				   if(!number.equals("")) {
					   contactList.setFirstName(number);
				   }
				   if(!address.equals("")) {
					   contactList.setFirstName(address);
				   }
				   return true;
			   }
			   
		   }
		   return false;
	 }
}