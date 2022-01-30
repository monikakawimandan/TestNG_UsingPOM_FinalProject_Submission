package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Test3Page {

	WebDriver driver;
	
	public Test3Page(WebDriver driver) {
		this.driver = driver;
	}
	
//	@FindBy(how = How.XPATH, using = "//select[@name=\"due_month\"]") WebElement MONTH_DROPDOWN;
	
	@FindBy(how = How.CSS, using = "select[name=\"due_month\"]") WebElement MONTH_DROPDOWN;

	
	public void verifyingMonthDropdown() {
		
		String[] arr = {"none","Jan","Feb","Mar", "Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		 
		Select select = new Select(MONTH_DROPDOWN);
		
		List<WebElement> options = select.getOptions();

		 for(WebElement we : options){
		     for(int i = 1; i<arr.length; i++){
		         if(we.getText().equals(arr[i])){
		             System.out.println(arr[i] + " " +  "Matched" );
		             break;
		         }
		     }
		 }
	}


	
}
