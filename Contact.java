import java.util.Scanner;

public class Contact {
	//initilize variables
	public String contactID;
	public String firstName;
	public String lastName;
	public String phone;
	public String address;
	
	Scanner inputStream = new Scanner(System.in);
	
	//default constructor
	//contact class
	//	add error checking DONE
	//	method for info getting? DONE
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		
		// Enter a contact ID
		setContactID(contactID);
		// Enter a first name
		updateFirstName(firstName);
		
		// Enter a last name
		updateLastName(lastName);
		
		// Enter a phone number
		updatePhone(phone);
		
		// Enter an address
		updateAddress(address);
		
	}
	
	//sets the contact ID, shouldn't be called again from super classes
	private void setContactID(String contactID) {
		//check to see if null, greater than 10
		if (contactID.length() > 10 || contactID == "" || contactID.isEmpty()) {
			throw new IllegalArgumentException("Invalid input.");
		}
		//set contactID
		this.contactID = contactID;
	}
	
	//sets and updates the first name
	public void updateFirstName(String firstName) {
		//check to see if null, greater than 10
		if (firstName.length() > 10 || firstName == "" || firstName.isEmpty()) {
			throw new IllegalArgumentException("Invalid input.");
		}
		//set firstName
		this.firstName = firstName;
	}
	
	//sets and updates the last name
	public void updateLastName(String lastName) {
		//check to see if null, greater than 10
		if (lastName.length() > 10 || lastName == "" || lastName.isEmpty()) {
			throw new IllegalArgumentException("Invalid input.");			
			//call self to rectify invalid
		}
		//set lastName
		this.lastName = lastName;
	}
	
	//sets and updates the phone
	public void updatePhone(String phone) {
		//check to see if null, greater than 10
		if (phone.length() > 10 || phone == "" || phone.isEmpty()) {
			throw new IllegalArgumentException("Invalid input.");			
			//call self to rectify invalid
		}
		//set phone number
		this.phone = phone;
	}
	
	//sets and updates the address
	public void updateAddress(String address) {
		//check to see if null, greater than 30
		if (address.length() > 30 || address == "" || address.isEmpty()) {
			throw new IllegalArgumentException("Invalid input.");		
			//call self to rectify invalid
		}
		// set address
		this.address= address;

	}
	
	
}
