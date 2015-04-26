package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
	@Test
	public void modifySomeGroup() {
		app.getNavigationHelper().openMainPage();
	    app.getContactHelper().selectContactByIndex(14);
	    ContactData contact = new ContactData();
	    contact.fname = "new first name 4";
	    contact.lname = "new last name 4";
	    app.getContactHelper().fillContactForm(contact);
	    app.getContactHelper().submitContactModification();
	    app.getNavigationHelper().returnToHomePage();
	    
	}
}
