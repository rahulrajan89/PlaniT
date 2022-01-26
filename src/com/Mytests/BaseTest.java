package com.Mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Pages.BasePage;
import com.Pages.Page;

public class BaseTest {

	WebDriver driver;
	public Page page;
	
	@BeforeMethod
	@Parameters(value={ "browser" })
	public void setupTest(String Browser){
		if (Browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-4.1.0\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (Browser.equals("firefox")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
			driver = new OperaDriver();
	}
		else{
			System.out.println("no browser");
		}
		driver.get("http://jupiter.cloud.planittesting.com");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page = new BasePage(driver);
		}
	
	@AfterMethod
	public void Exit() {
		driver.quit();
}
}