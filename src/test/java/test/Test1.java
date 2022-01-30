package test;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.Test1Page;
import util.BrowserFactory;

public class Test1  {


WebDriver driver;
	
	@Test
	@Parameters({"addItem"})
	public void userAddingCategory(String item) throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		Test1Page t1 = PageFactory.initElements(driver, Test1Page.class);
		
		
		//t1.colorDropdown();
//		t1.selectFromColorDropdown();
		
		Thread.sleep(2000);
		t1.addingCategoryItem(item);
		t1.clickingAddCategoryButton();
		
//		t1.clickingYesLink();
		
//		t1.addingCategoryWithColor();
		
		System.out.println("Category is added.... Test1 Passed!!!");
		
		Thread.sleep(2000);
		BrowserFactory.tearDown();
	}
		
}

	  	

