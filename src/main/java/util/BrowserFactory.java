package util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {

	static WebDriver driver;
	static String browser;
	static String url;
	
//	static String browser = "chrome";
//	static String url = "https://techfios.com/test/101/";
	
	
public static void readConfig() {
		
		// for properties file
		Properties prop = new Properties();
		
		try {
			
			// to read properties file
			InputStream input = new FileInputStream("src\\main\\java\\config\\config.properties");
			prop.load(input);
			
			browser = prop.getProperty("browser");
			url =prop.getProperty("url");
		}
		catch(Exception e) {
			
			e.getStackTrace();
			
		}
		
	}
	
	public static WebDriver init() {
		
		readConfig();
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void tearDown() {
		
		driver.close();
	//	driver.quit();
	}
	
}
