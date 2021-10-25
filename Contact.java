
//Author Name:Brandon Hamilton

//Date: 09/17/2021

//Course ID: CS-320

//Description: JUnit tests for contactServices.java
public class Contact {
	//class variables
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private String contactID;
	private String nA = "N/A";
	// default constructor 
	public Contact(){
		this.contactID = nA;
		this.firstName = nA;
		this.lastName = nA;
		this.phone = nA;
		this.address = nA;
	}
	//Overloaded constructors	
	public Contact(String contactID){
		setContactID(contactID);
		this.firstName = nA;
		this.lastName = nA;
		this.phone = nA;
		this.address = nA;
	}
	public Contact(String contactID, String firstName){
		setContactID(contactID);
		setFName(firstName);
		this.lastName = nA;
		this.phone = nA;
		this.address = nA;
	}
	public Contact(String contactID, String firstName, String lastName){
		setContactID(contactID);
		setFName(firstName);
		setLName(lastName);
		this.phone = nA;
		this.address = nA;
	}
		
	public Contact(String contactID, String firstName, String lastName, String phone){
		setContactID(contactID);
		setFName(firstName);
		setLName(lastName);
		setPhone(phone);
		this.address = nA;
	}
	public Contact(String contactID, String firstName, String lastName, String phone, String address){
		setContactID(contactID);
		setFName(firstName);
		setLName(lastName);
		setPhone(phone);
		setAddress(address);
	}
			
	// Access methods:
	public String getContactID() {
	  return contactID;
	}
	public String getFName() {
	  return firstName;
	}
	public String getLName() {
	  return lastName;
	}
	public String getPhone() {
	  return phone;
	}
	
	public String getAddress() {
	  return address;
	}
	 
	 
	// Mutator methods:
	public void setContactID(String newcontactID) {
	  if ( firstName== null || contactID.length() > 10){
			throw new IllegalArgumentException("Invalid input, cannot exceed 10 characters or remain empty");
			}else{
				this.contactID = newcontactID;
		}
	}
	
	public void setFName(String newFirst) {
	  if ( firstName== null || firstName.length() > 10){
			throw new IllegalArgumentException("Invalid input, cannot exceed 10 characters or remain empty");
			}else{
				this.firstName = newFirst;
		}
	}
	
	public void setLName(String newLast) {
		if (lastName == null || lastName.length() > 10){
			throw new IllegalArgumentException("Invalid input, cannot exceed 10 characters or remain empty");
			}else{
				this.lastName = newLast;
			}
	}
	
	public void setPhone(String newPhone) {
	  if (phone == null || phone.length() > 10){
			throw new IllegalArgumentException("Invalid input, cannot exceed 10 characters or remain empty");
			}else{
				this.phone = newPhone;
		}
	}
	
	public void setAddress(String newAddress) {
	  if (address == null || address.length() > 30){
			throw new IllegalArgumentException("Invalid input, cannot exceed 30 characters or remain empty");
			}else{
				this.address = newAddress;
		}
	}
}
