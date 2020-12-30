package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaStickyVideoUtils;

public class EaStickyVideo {
	public static void eaStickyVideo(WebDriver driver, String url) {

		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaStickyVideoUtils.TEXT.stickyvideo_page_title,
					eaStickyVideoUtils.Locator.documentation_link_path, eaStickyVideoUtils.TEXT.documentation_page);

			Config.closeNotifications.floatNotification(driver);
//			Config.closeNotifications.betterdocs(driver);
			Config.closeNotifications.notificationBar(driver);
			
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,983)", "");

//			driver.findElement(By.xpath(eaStickyVideoUtils.Locator.play_button_xpath)).click();
//			Thread.sleep(1000);
			
			js.executeScript("window.scrollBy(0,1000)", "");
			
			Thread.sleep(2000);
			
//			driver.findElement(By.xpath(eaStickyVideoUtils.Locator.play_button_xpath)).click();

			driver.findElement(By.xpath(eaStickyVideoUtils.Locator.close_button_xpath)).click();
			System.out.println("Sticky video closed");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
