package com.example.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.ContactData;


public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void submitContactCreation() {
		click(By.name("submit"));
	}

	public void fillContactForm(ContactData contact) {
		type(By.name("firstname"), contact.fname);
		type(By.name("lastname"), contact.lname);
		type(By.name("address"), contact.address1);
		type(By.name("home"), contact.homephone);
		type(By.name("mobile"), contact.mobilephone);
		type(By.name("work"), contact.workphone);
		type(By.name("email"), contact.email1);
		type(By.name("email2"), contact.email2);
	    String text = contact.birthday;
	    selectByText(By.name("bday"), contact.birthday);
	    selectByText(By.name("bmonth"), contact.birthmonth);
	    type(By.name("byear"), contact.birthyear);
	  //selectByText(By.name("new_group"), contact.addgroup);
	    type(By.name("address2"), contact.address2);
	    type(By.name("phone2"), contact.homephone2);
	   
	}

	

}
