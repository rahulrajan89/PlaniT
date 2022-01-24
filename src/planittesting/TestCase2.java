package planittesting;

import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 {
	WebDriver driver = null;
  @Test
  	  public void Shopping() throws InterruptedException	{
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://jupiter.cloud.planittesting.com");
			Thread.sleep(4000);
			driver.findElement(By.linkText("Shop")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//li[@id='product-4']/div/p/a")).click();
			for (int i=0; i<2;i++) {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//li[@id='product-6']/div/p/a")).click();
			}			
			Thread.sleep(5000);
			driver.findElement(By.partialLinkText("Cart")).click();
			Thread.sleep(4000);
			String ItemText1 = (driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).getText());
			String ItemText2 = (driver.findElement(By.xpath("//tbody/tr[2]/td[1]")).getText());
			String expitem1 = "Fluffy Bunny";
			String expitem2 = "Funny Cow";
			Assert.assertEquals(ItemText1,expitem1);
			Assert.assertEquals(ItemText2,expitem2);
			System.out.println("Verification Pass");
  }
  @BeforeTest
  public void setUptest() {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-4.1.0\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  }
