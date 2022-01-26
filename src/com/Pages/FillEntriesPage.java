package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Rahul
 *
 */
public class FillEntriesPage extends BasePage {
	
	//page locators
	private By firstname = By.id("forename");
	private By surname = By.id("surname");
	private By email = By.id("email");
	private By telephone = (By.id("telephone"));
	private By message = (By.id("message"));
	private By Submit = (By.linkText("Submit"));
	private By Alert = (By.cssSelector(".alert-success"));

	public FillEntriesPage(WebDriver driver) {
		super(driver);
		
	}
	//getters:

	public WebElement getFirstname() {
		return getElement(firstname);
	}

	public WebElement getSurname() {
		return getElement(surname);
	}

	public WebElement getEmail() {
		return getElement(email);
	}

	public WebElement getTelephone() {
		return getElement(telephone);
	}

	public WebElement getMessage() {
		return getElement(message);
	}

	public WebElement getSubmit() {
		return getElement(Submit);
	}

	public WebElement getAlert() {
		return getElement(Alert);
	}

	public void Entervalue(String firstname,String surname,String email,String telephone,String message) throws InterruptedException{
		getFirstname().sendKeys(firstname);
		getSurname().sendKeys(surname);
		getEmail().sendKeys(email);
		getMessage().sendKeys(message);
		getSubmit().click();
		getAlert().getText();

	}
	

}
