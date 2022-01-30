package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Test2Page {

	WebDriver driver;
//	String addItem = "Selenium99";
	
	public Test2Page(WebDriver driver) {
		this.driver = driver;
	}

//	@FindBy(how = How.XPATH, using = "//input[@name=\"categorydata\"]") WebElement ADD_CATEGORY_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//input[@value=\"Add category\"]") WebElement ADD_CATEGORY_BUTTON;
//	@FindBy(how = How.XPATH, using = "/html/body/a[1]") WebElement YES_LINK_ELEMENT;
	
	@FindBy(how = How.CSS, using = "input[name=\"categorydata\"]") WebElement ADD_CATEGORY_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value=\"Add category\"]") WebElement ADD_CATEGORY_BUTTON;
	@FindBy(how = How.XPATH, using = "/html/body/a[1]") WebElement YES_LINK_ELEMENT;
	@FindBy(how = How.CSS, using = "a[href=\"javascript:history.back();\"]") WebElement NEVERMIND_LINK_ELEMENT;
	
	public void addingCategoryItem(String addItem) {
		
		ADD_CATEGORY_ELEMENT.sendKeys(addItem);
		
	}
	
	
	public void clickingAddCategoryButton() {
		ADD_CATEGORY_BUTTON.click();
		
	}
	
	public void clickingYesLink() {
		YES_LINK_ELEMENT.click();
		
	}
	public void clickingNevermindLink() {
		NEVERMIND_LINK_ELEMENT.click();
		
	}
	
	
	public void verifyExistingCategory(String addItem) {
		
		if ( driver.getPageSource().contains(addItem)){
			clickingNevermindLink();
			System.out.println("Categoty already exist: <duplicated category name>");
		}
		else {
			System.out.println("Category Added");
			
			}
		}
		
	
}
