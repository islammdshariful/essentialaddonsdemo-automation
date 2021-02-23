package runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import testcases.EaPostBlock;
import wpdev.ea.utils.Config;
import wpdev.ea.utils.DriverManager;

public class EA_PostBlock {
	WebDriver driver = null;

//	@Test
	public void invokeBrowser() {
		driver = DriverManager.driver;
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@Test
	public void postBlockTestCase() {
		invokeBrowser();
		EaPostBlock.eaPostBlock(driver, "post-block/");
//		driver.close();
	}
}
