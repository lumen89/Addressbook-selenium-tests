package com.example.tests;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testNonEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getNavigationHelper().gotoContactPage();
    ContactData contact = new ContactData();
    contact.fname = "FirstName3";
    contact.lname = "LastName3";
    contact.address1 = "Address2";
    contact.homephone = "81112223344";
    contact.mobilephone = "92223334455";
    contact.workphone = "03334445566";
    contact.email1 = "email@1.com";
    contact.email2 = "email@2.ru";
    contact.birthday = "9";
    contact.birthmonth = "September";
    contact.birthyear = "1988";
    contact.addgroup = "group 1";
    contact.address2 = "Address3";
    contact.homephone2 = "Homephone3";
    app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToHomePage();
  }
  
  @Test
  public void testEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getNavigationHelper().gotoContactPage();
    app.getContactHelper().fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", "", ""));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToHomePage();
  }
}
