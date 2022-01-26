package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page {

	public BasePage(WebDriver driver) {
		super(driver);
		
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element = null;
		try{
			waitforElementPresent(locator);
			element = driver.findElement(locator);
			return element;
		}
		catch (Exception e){
			System.out.println("some error"+locator.toString());
		}
		return element;
	}

	@Override
	public void waitforElementPresent(By locator) {
		try{
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		catch(Exception e){
			System.out.println("some exception error while waiting"+locator.toString());
		}
	}
	
	
	
	
	
	
	
	
	

}
