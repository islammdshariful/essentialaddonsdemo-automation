package wpdev.ea.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	static {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
	}

	public static WebDriver driver = new ChromeDriver();
//	public static WebDriver driver = new FirefoxDriver();

	private DriverManager() {
		
	}

}
