package com.example.tests;

public class ContactData {
	public String fname;
	public String lname;
	public String address1;
	public String homephone;
	public String mobilephone;
	public String workphone;
	public String email1;
	public String email2;
	public String birthday;
	public String birthmonth;
	public String birthyear;
	public String addgroup;
	public String address2;
	public String homephone2;

	public ContactData() {
	}
	
	public ContactData(String fname, String lname, String address1,
			String homephone, String mobilephone, String workphone,
			String email1, String email2, String birthday, String birthmonth,
			String birthyear, String addgroup, String address2,
			String homephone2) {
		this.fname = fname;
		this.lname = lname;
		this.address1 = address1;
		this.homephone = homephone;
		this.mobilephone = mobilephone;
		this.workphone = workphone;
		this.email1 = email1;
		this.email2 = email2;
		this.birthday = birthday;
		this.birthmonth = birthmonth;
		this.birthyear = birthyear;
		this.addgroup = addgroup;
		this.address2 = address2;
		this.homephone2 = homephone2;
	}
}