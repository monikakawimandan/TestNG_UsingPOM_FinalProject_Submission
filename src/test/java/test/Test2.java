package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import page.Test2Page;
import util.BrowserFactory;

public class Test2 {

WebDriver driver;
	
	@Test
	@Parameters({"addItem"})
	public void verifyingExistingCategory(String item) throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		Test2Page t2 = PageFactory.initElements(driver, Test2Page.class);
		
		t2.addingCategoryItem(item);
		t2.clickingAddCategoryButton();
		
		Thread.sleep(2000);

		t2.verifyExistingCategory(item);
		
		Thread.sleep(2000);
		BrowserFactory.tearDown();
	}
	
	
}
