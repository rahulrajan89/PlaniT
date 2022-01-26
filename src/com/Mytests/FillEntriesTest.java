package com.Mytests;

import org.testng.annotations.Test;

import com.Pages.FillEntriesPage;

public class FillEntriesTest extends BaseTest {
	
	@Test (invocationCount=5)
	public void verifysuccefulEntry() throws InterruptedException{
		page.getInstance(FillEntriesPage.class).Entervalue("Tom","Cruise","tm.gmail.com","1234","Test1");
		Thread.sleep(6000);
		String Alert = page.getInstance(FillEntriesPage.class).getAlert().getText();
		if (Alert.contains("appreciate your feedback"))
			System.out.println("Verification Success");
			else
			System.out.println("Verification Fail");
	}
}
