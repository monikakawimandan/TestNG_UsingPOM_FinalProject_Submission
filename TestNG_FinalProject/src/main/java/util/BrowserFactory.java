package util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

	static WebDriver driver;
	static String browser;
	static String url;

	// Read a configuration file
	public static void readConfig() {

		// Read a properties file
		Properties prop = new Properties();

		try {
			InputStream input = new FileInputStream("src\\main\\java\\cofig\\Config.Properties");
			prop.load(input);

			browser = prop.getProperty("browser");
			url = prop.getProperty("URL");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static WebDriver init() {

		readConfig();

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\monik\\eclipse-workspace\\TestNG_FinalProject\\TestNG_FinalProject\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\monik\\eclipse-workspace\\TestNG_FinalProject\\TestNG_FinalProject\\Drivers\\MicrosoftEdge\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
		
	}

	public static void tearDown() {
		driver.close();
		driver.quit();
	}
	
	
}
