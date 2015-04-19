package com.example.tests;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testNonEmptyContactCreation() throws Exception {
	openMainPage();
	gotoContactPage();
    ContactData contact = new ContactData();
    contact.fname = "FirstName2";
    contact.lname = "LastName2";
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
    fillContactForm(contact);
    submitContactCreation();
    returnToHomePage();
  }
  
  @Test
  public void testEmptyContactCreation() throws Exception {
	openMainPage();
	gotoContactPage();
    fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", "", ""));
    submitContactCreation();
    returnToHomePage();
  }
}
