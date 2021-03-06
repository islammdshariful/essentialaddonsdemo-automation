package runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testcases.EaProtectedContent;
import wpdev.ea.utils.Config;
import wpdev.ea.utils.DriverManager;

public class EA_ProtectedContent {
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
	public void protectedContent() {
		invokeBrowser();
		EaProtectedContent.eaProtectedContent(driver, "protected-content/");
//		driver.close();
	}
}
