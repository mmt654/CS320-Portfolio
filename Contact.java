package contact;

public class Contact{
	
	String ID;
	String firstName;
	String lastName;
	String number;
	String address;
	
	public contact(String ID, String firstName, String lastName, String number, String address) {
		
		super()
		this.ID = ID;
		this.firstName = firstName;
		this.lastNAme= lastName;
		this.number = number;
		this.address = address;
		
		
	}
	
	public String getID() {
		
		return ID;
		
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstNamel;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void String setLastName(String lastName) {
		this.lastName=lastName
	}
	
	public Sring getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number= number;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	
	public String convertString() {
		return " Contact [ ID= "+ ID + ",firstName= "+ firstName +",lastName= "+ lastName",number= "+ number + ",address= "+ address + "] ";
	}
}