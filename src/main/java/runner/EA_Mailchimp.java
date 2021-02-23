package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;;
import testcases.EaMailChimp;

import java.util.concurrent.TimeUnit;

public class EA_Mailchimp {
    WebDriver driver = null;

    //	@Test
    public void invokeBrowser() {
        driver = wpdev.ea.utils.DriverManager.driver;
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }


    @Test
    public void dividerTestCase() {
        invokeBrowser();
        EaMailChimp.eamailchimp(driver, "mailchimp/");
//		driver.close();
    }
}
