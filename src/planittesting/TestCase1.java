package planittesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
		WebDriver driver = null;
	
		@BeforeTest
		public void setUptest() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-4.1.0\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		
		@Test (invocationCount=5)
		public void FillEntries() throws InterruptedException	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://jupiter.cloud.planittesting.com");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("forename")).sendKeys("Tom");
		driver.findElement(By.id("surname")).sendKeys("Cruise");
		driver.findElement(By.id("email")).sendKeys("tomcruise@gmail.com");
		driver.findElement(By.id("telephone")).sendKeys("12345");
		driver.findElement(By.id("message")).sendKeys("This is for PlanIttestinDemo");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Submit")).click();
		Thread.sleep(6000);
		String SuccessText = (driver.findElement(By.cssSelector(".alert-success")).getText());
		if (SuccessText.contains("appreciate your feedback"))
		System.out.println("Verification Success");
		else
		System.out.println("Verification Fail");
		
		}
		
		@AfterTest
		public void Exit() {
		
		driver.quit();
  }
		}
