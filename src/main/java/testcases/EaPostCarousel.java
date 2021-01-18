package testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import utils.eaDividerUtils;
import utils.eaPostCarouselUtils;

public class EaPostCarousel {
	public static void eaPostCarousel(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaPostCarouselUtils.TEXT.postcarousel_page_title,
					eaPostCarouselUtils.Locator.documentation_link_path, eaPostCarouselUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1005)", "");
			Thread.sleep(1000);
			driver.findElement(By.xpath(eaPostCarouselUtils.Locator.dot_xpath)).click();
			Thread.sleep(1000);
			Actions cursor = new Actions(driver);
			WebElement post_name = driver.findElement(By.xpath(eaPostCarouselUtils.Locator.post_header_xpath));
//			Thread.sleep(1000);
//			cursor.moveToElement(post_name).build().perform();
			String name = post_name.getText();
			System.out.println("Post name is: " + name);
			driver.findElement(By.xpath(eaPostCarouselUtils.Locator.dot_xpath)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(eaPostCarouselUtils.Locator.post_header_xpath)).click();
//			WebElement post = driver.findElement(By.xpath(eaPostCarouselUtils.Locator.post_header_xpath));
			Thread.sleep(1000);
//			cursor.moveToElement(post).click().build().perform();
//			post.click();
			softassert.assertEquals(driver.findElement(By.xpath(eaPostCarouselUtils.Locator.post_page_xpath)).getText(),
					name);
			driver.navigate().back();
			softassert.assertAll();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
