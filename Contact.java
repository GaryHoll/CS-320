package app;

public class Contact {
	String contactID;
	String firstName;
	String lastName;
	String phone;
	String address;
	
	//Constructor for the contact class. Creates an oject with ID, first name, last name, phone, and address
	public Contact(String contactID,String firstName, String lastName, String phone, String address) {
		//Throws exception for null and length over 10 characters
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
	}
		//Throws exception for null and length over 10 characters
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		//Throws exception for null and length over 10 characters
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		//Throws exception for null and length that is not 10 characters
		if(phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone");
		}
		//Throws exception for null and length over 30 characters
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		//If no exception is thrown than object is created
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	// Getter and setter methods
	
	//Getters
	public String getID() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	//Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
	
	

