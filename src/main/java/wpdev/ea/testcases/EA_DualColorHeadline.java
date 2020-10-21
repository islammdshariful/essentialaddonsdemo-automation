package wpdev.ea.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import wpdev.ea.EaDualColorHeadline;
import wpdev.ea.utils.Config;
import wpdev.ea.utils.DriverManager;

public class EA_DualColorHeadline {
	WebDriver driver = null;

	@Test
	public void invokeBrowser() {
		driver = DriverManager.driver;
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@Test(dependsOnMethods = "invokeBrowser")
	public void openPage() {
		driver.get(Config.url + "dual-color-headline/");
	}

	@Test(dependsOnMethods = "openPage")
	public void eaDualColorHeadlineTestCase() {
		EaDualColorHeadline.eaDualColorHeadline(driver);
//		driver.close();
	}
}
