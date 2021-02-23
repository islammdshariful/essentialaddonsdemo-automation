package runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testcases.EaToggle;
import wpdev.ea.utils.DriverManager;
import wpdev.ea.utils.Config;

public class EA_Toggle {
	WebDriver driver = null;

//	@Test
	public void invokeBrowser() {
		driver = DriverManager.driver;
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Test
	public void toggleTestCase() {
		invokeBrowser();
		EaToggle.eaToggle(driver, "content-toggle/");
//		driver.close();
	}
}
