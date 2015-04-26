package com.example.fw;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

	public NavigationHelper(ApplicationManager manager) {
		super(manager);
	}

	public void openMainPage() {
		driver.get(manager.baseUrl + "/addressbookv4.1.4/");
	}

	public void gotoGroupsPage() {
		click(By.linkText("groups"));
	}

	public void gotoContactPage() {
		click(By.linkText("add new"));
	}

	public void returnToHomePage() {
		click(By.linkText("home page"));
	}

	public void gotoEditContactPage() {
		click(By.xpath(".//tr[3]/td[7]/a"));
	}
	
}
