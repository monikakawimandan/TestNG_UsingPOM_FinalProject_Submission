package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Test1Page {

	WebDriver driver;
//	String addItem = "Selenium";
//	String colorName = "Purple";
	
	public Test1Page(WebDriver driver) {
		this.driver = driver;
	}

	
//	@FindBy(how = How.XPATH, using = "//input[@name=\"categorydata\"]") WebElement ADD_CATEGORY_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//input[@value=\"Add category\"]") WebElement ADD_CATEGORY_BUTTON;
//	@FindBy(how = How.XPATH, using = "//select[@title=\"Select default color for this category\"]") WebElement COLOR_DROPDOWN;
//	@FindBy(how = How.XPATH, using = "/html/body/a[1]") WebElement YES_LINK_ELEMENT;
//	@FindBy(how = How.XPATH, using = "/html/body/a[2]") WebElement ADD_CATEGORY_WITH_THIS_COLOR;
	
	@FindBy(how = How.CSS, using = "input[name=\"categorydata\"]") WebElement ADD_CATEGORY_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value=\"Add category\"]") WebElement ADD_CATEGORY_BUTTON;
	@FindBy(how = How.CSS, using = "select[name=\"colour\"]") WebElement COLOR_DROPDOWN;
	@FindBy(how = How.XPATH, using = "/html/body/a[1]") WebElement YES_LINK_ELEMENT;
	
	
	
	
	
	public int randomGenerator(int boundaryNumber) {
		Random rnd = new Random();
		int randomNo = rnd.nextInt(boundaryNumber);
		return randomNo;
	}
	
	public void addingCategoryItem(String addItem) {
		
		ADD_CATEGORY_ELEMENT.sendKeys(addItem + randomGenerator(999));
		
	}
	
	
	
	public void clickingAddCategoryButton() {
		ADD_CATEGORY_BUTTON.click();
		
	}
	
//	public void selectFromColorDropdown() {
//
//		Select sel1 = new Select(COLOR_DROPDOWN);
//		sel1.selectByVisibleText(colorName);
//	
//	}
//	
	public void clickingYesLink() {
		YES_LINK_ELEMENT.click();
		
	}
	
	
	
}





