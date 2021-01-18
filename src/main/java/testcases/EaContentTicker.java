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
import utils.eaContentTickerUtils;

public class EaContentTicker {
	public static void eaContentTicker(WebDriver driver, String pageurl) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + pageurl);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaContentTickerUtils.TEXT.contentticker_page_title,
					eaContentTickerUtils.Locator.documentation_link_path, eaContentTickerUtils.TEXT.documentation_page);

//			Config.closeNotifications.floatNotification(driver);
//			Config.closeNotifications.betterdocs(driver);
			Config.closeNotifications.notificationBar(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,1043)", "");
			js.executeScript("window.scrollBy(0,971)", "");

			Actions mousehover = new Actions(driver);

			Thread.sleep(1000);
			softassert.assertEquals(
					driver.findElement(By.xpath(eaContentTickerUtils.Locator.trending_today_xpath)).getText(),
					eaContentTickerUtils.TEXT.trendin_today_text);
			WebElement element = driver.findElement(By.xpath(eaContentTickerUtils.Locator.template_text_xpath));
			mousehover.moveToElement(element).build().perform();
			Thread.sleep(1000);

			softassert.assertEquals(element.getText(), eaContentTickerUtils.TEXT.template_text, "Template Test Failed");
			driver.findElement(By.xpath(eaContentTickerUtils.Locator.navigation_button_xpath)).click();
			Thread.sleep(1000);
			WebElement element2 = driver
					.findElement(By.xpath(eaContentTickerUtils.Locator.template_using_shortcode_text_xpath));
			mousehover.moveToElement(element2).build().perform();
			Thread.sleep(1000);
			softassert.assertEquals(element2.getText(), eaContentTickerUtils.TEXT.template_using_shortcode_text,
					"Template using shortcut text Failed!");
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
