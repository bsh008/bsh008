
//Author Name:Brandon Hamilton

//Date: 09/17/2021

//Course ID: CS-320

//Description: contactServices.java

import java.util.ArrayList;
import java.util.List;


public class ContactServices {
	private String uniqueID;
	private List<Contact> contactList = new ArrayList<>();
	
	////
	//generates uniqueID
	////
	private String createUniqueID(){
		//inspiration from stack overflow user: OldCurmudgeon
		long last= 0;

		  // 10 digits.
		long id = System.currentTimeMillis() % 100;
		if ( id <= last ) {
		    id = (last + 1) % 100;
		  }
		
		uniqueID = String.valueOf(id);
		
		return uniqueID;
	}
	
	////
	//overloaded class to add contacts given different parameter(s)
	////
	public void addContact(){
		Contact contact = new Contact(createUniqueID());
		contactList.add(contact);
	}
	
	public void addContact(String firstName){
		Contact contact = new Contact(createUniqueID(),firstName);
		contactList.add(contact);
	}
	
	public void addContact(String firstName, String lastName){
		Contact contact = new Contact(createUniqueID(),firstName,lastName);
		contactList.add(contact);
	}
	public void addContact(String firstName, String lastName, String phone){
		Contact contact = new Contact(createUniqueID(),firstName,lastName,phone);
		contactList.add(contact);
	}
	
	public void addContact(String firstName, String lastName, String phone, String address){
		Contact contact = new Contact(createUniqueID(),firstName,lastName,phone, address);
		contactList.add(contact);
	}
	////
	// functions to update contact properties
	////
	public void setFName(String cID, String firstName) throws Exception {
		contactSearch(cID).setFName(firstName);
	}
	public void setLName(String cID, String lastName) throws Exception {
		contactSearch(cID).setLName(lastName);
	}
	public void setPhone(String cID, String phone) throws Exception {
		contactSearch(cID).setPhone(phone);
	}
	public void setAddress(String cID, String address) throws Exception {
		contactSearch(cID).setAddress(address);
	}
	public void remove(String cID) throws Exception{
		contactList.remove(contactSearch(cID));
	}
	//
	public List<Contact> getContactList() {
		return contactList;
	}
	////
	// locate specific contact with the unique customer ID	
	////
	private Contact contactSearch(String cID) throws Exception{
		int i = 0;
		
		while(i < contactList.size()){
			if(cID.equals(contactList.get(i).getContactID())){
				return contactList.get(i);
			}
			i++;
		}
		throw new Exception("Error: Does not exist.");
	}
}
