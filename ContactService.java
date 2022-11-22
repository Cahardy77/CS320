
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class ContactService {
	
	public static List<Contact> contactsList = new ArrayList<>();
	public static Scanner inputStream = new Scanner(System.in);
	
	
	public static void addContact(String contactID, String firstName, String lastName, String phone, String address) {
		Contact tempContact = new Contact(contactID,firstName,lastName,phone,address);
		contactsList.add(tempContact);
	}
	
	
	public static void deleteContact(String contactID) {
		for (int i = 0 ; i < contactsList.size() ; i++) {
			if (contactsList.get(i).contactID.equals(contactID)) {
				System.out.println("Deleted " + contactsList.get(i).contactID);
				contactsList.remove(i);
			}
		}
	}
	
	public static void updateFirst(String contactID, String firstName) {
		
		for (int i = 0 ; i < contactsList.size() ; i++) {
			if (contactsList.get(i).contactID.equals(contactID)) {
				contactsList.get(i).updateFirstName(firstName);
			}
		}
		
	}
	
	public static void updateLast(String contactID, String lastName) {
		for (int i = 0 ; i < contactsList.size() ; i++) {
			if (contactsList.get(i).contactID.equals(contactID)) {
				contactsList.get(i).updateLastName(lastName);
			}
		}
	}
	
	public static void updatePhone(String contactID, String phone) {
		for (int i = 0 ; i < contactsList.size() ; i++) {
			if (contactsList.get(i).contactID.equals(contactID)) {
				contactsList.get(i).updatePhone(phone);
			}
		}
	}
	
	public static void updateAddress(String contactID, String address) {
		for (int i = 0 ; i < contactsList.size() ; i++) {
			if (contactsList.get(i).contactID.equals(contactID)) {
				contactsList.get(i).updateAddress(address);
			}
		}
		System.out.println();
	}
}
