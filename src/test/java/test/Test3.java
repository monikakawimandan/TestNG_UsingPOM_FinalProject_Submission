package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Test2Page;
import page.Test3Page;
import util.BrowserFactory;

public class Test3 {

	WebDriver driver;
	
	@Test
public void verifyingAllMonthsDropdown() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		Test3Page t3 = PageFactory.initElements(driver, Test3Page.class);
		
		t3.verifyingMonthDropdown();	
		
		System.out.println();
		System.out.println("All Months from dropdown menu are verified!!!");
		
		Thread.sleep(2000);
		BrowserFactory.tearDown();
	}
	
	
}
	
	

