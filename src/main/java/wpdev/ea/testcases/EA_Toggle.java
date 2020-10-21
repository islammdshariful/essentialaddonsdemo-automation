package wpdev.ea.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import wpdev.ea.EaToggle;
import wpdev.ea.utils.DriverManager;
import wpdev.ea.utils.Config;

public class EA_Toggle {
	WebDriver driver = null;

	@Test
	public void invokeBrowser() {
		driver = DriverManager.driver;
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Test(dependsOnMethods = "invokeBrowser")
	public void openPage() {
		driver.get(Config.url + "content-toggle/");
	}

	@Test(dependsOnMethods = "openPage")
	public void toggleTestCase() {

		EaToggle.eaToggle(driver);
		driver.close();
	}
}
