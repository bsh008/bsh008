//

//Author Name:Brandon Hamilton

//Date: 09/17/2021

//Course ID: CS-320

//Description: JUnit tests for contact.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactTest {
protected String testContactId, testFirstName, testLastName, testPhoneNumber,testAddress;
protected String longContactId, longFirstName, longLastName,longPhoneNumber, shortPhoneNumber, longAddress;

@BeforeEach
void initVals() {
	// values meet criteria
  testContactId = "9876543210";
  testFirstName = "Mike";
  testLastName = "Jones";
  testPhoneNumber = "2813308004";
  testAddress = "scruffmcGruff chicago,IL 60652";
	//value that exceed criteria
  longContactId = "31415926535";
  longFirstName = "abcdefghijklm";
  longLastName = "nopqrstuvwxyz";
  longPhoneNumber = "911911911911";
  longAddress = "1600 Pennsylvania Ave NW, Washington, DC 20006";
	// does not meet required length
	shortPhoneNumber = "8675309";
}

@Test
void TestContact() {
  Contact contact = new Contact();
  assertAll("constructor",
      () -> assertNotNull(contact.getContactID()),
      () -> assertNotNull(contact.getFName()),
      () -> assertNotNull(contact.getLName()),
      () -> assertNotNull(contact.getPhone()),
      () -> assertNotNull(contact.getAddress()));
}

@Test
void testContactIdConstructorTest() {
  Contact contact = new Contact(testContactId);
  assertAll("CID",
      () -> assertEquals(testContactId, contact.getContactID()),
		//
      () -> assertNotNull(contact.getFName()),
	  () -> assertNotNull(contact.getLName()),
      () -> assertNotNull(contact.getPhone()),
      () -> assertNotNull(contact.getAddress()));
}

@Test
void contactIdAndFirstNameConstructorTest() {
  Contact contact = new Contact(testContactId, testFirstName);
  assertAll("CID & first name",
		() -> assertEquals(testContactId, contact.getContactID()),
      () -> assertEquals(testFirstName, contact.getFName()),
		//
      () -> assertNotNull(contact.getLName()),
      () -> assertNotNull(contact.getPhone()),
      () -> assertNotNull(contact.getAddress()));
}

@Test
void cIDNameConstructorTest() {
  Contact contact = new Contact(testContactId, testFirstName, testLastName);
  assertAll("CID, first & last name",
      () -> assertEquals(testContactId, contact.getContactID()),
      () -> assertEquals(testFirstName, contact.getFName()),
      () -> assertEquals(testLastName, contact.getLName()),
		//
      () -> assertNotNull(contact.getPhone()),
		() -> assertNotNull(contact.getAddress()));
}

@Test
void CIDFullNamePhoneConstructorTest() {
  Contact contact = new Contact(testContactId, testFirstName, testLastName, testPhoneNumber);
  assertAll("CID,first & Last name, phone Number",
      () -> assertEquals(testContactId, contact.getContactID()),
      () -> assertEquals(testFirstName, contact.getFName()),
      () -> assertEquals(testLastName, contact.getLName()),
      () -> assertEquals(testPhoneNumber, contact.getPhone()),
		//
      () -> assertNotNull(contact.getAddress()));
}

@Test
void allParamConstructorTest() {
  Contact contact = new Contact(testContactId, testFirstName, testLastName, testPhoneNumber, testAddress);
  assertAll("CID,first & Last name, phone Number, & address",
      () -> assertEquals(testContactId, contact.getContactID()),
	  () -> assertEquals(testFirstName, contact.getFName()),
      () -> assertEquals(testLastName, contact.getLName()),
	  () -> assertEquals(testPhoneNumber, contact.getPhone()),
      () -> assertEquals(testAddress, contact.getAddress()));
}

@Test
void updateContactIdTest() {
  Contact contact = new Contact();
  contact.setContactID(testContactId);
  assertAll(
      "CID",
      () -> assertEquals(testContactId, contact.getContactID()),
      () -> assertThrows(IllegalArgumentException.class,
      () -> contact.setContactID(null)),
	  () -> assertThrows(IllegalArgumentException.class,
      () -> contact.setContactID(longContactId)));
}

@Test
void updatetestFirstName() {
  Contact contact = new Contact();
  contact.setFName(testFirstName);
  assertAll(
      "firstName",
      () -> assertEquals(testFirstName, contact.getFName()),
			() -> assertThrows(IllegalArgumentException.class,
      () -> contact.setFName(null)),
			() -> assertThrows(IllegalArgumentException.class,
		() -> contact.setFName(longFirstName)));
}

@Test
void updatetestLastName() {
  Contact contact = new Contact();
  contact.setLName(testLastName);
  assertAll(
      "lastName",
      () -> assertEquals(testLastName, contact.getLName()),
	  () -> assertThrows(IllegalArgumentException.class,
      () -> contact.setLName(null)),
      () -> assertThrows(IllegalArgumentException.class,
      () -> contact.setLName(longLastName)));
}

@Test
void updateTestPhoneNumber() {
  Contact contact = new Contact();
  contact.setPhone(testPhoneNumber);
  assertAll("phone",
		() -> assertEquals(testPhoneNumber, contact.getPhone()),
			() -> assertThrows(IllegalArgumentException.class,
      () -> contact.setPhone(null)),
			() -> assertThrows(IllegalArgumentException.class,
      () -> contact.setPhone(longPhoneNumber)),
			() -> assertThrows(IllegalArgumentException.class,
      () -> contact.setPhone(shortPhoneNumber)),
			() -> assertThrows(IllegalArgumentException.class,
      () -> contact.setPhone(testContactId)));
}

@Test
void updateTestAddress() {
  Contact contact = new Contact();
  contact.setAddress(testAddress);
  assertAll("address",
      () -> assertEquals(testAddress, contact.getAddress()),
			() -> assertThrows(IllegalArgumentException.class,
      () -> contact.setAddress(null)),
			() -> assertThrows(IllegalArgumentException.class,
      () -> contact.setAddress(longAddress)));
}


}
