package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaSmartPostListUtils;

public class EaSmartPostList {
	public static void eaSmartPostList(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaSmartPostListUtils.TEXT.smartpostlist_page_title,
					eaSmartPostListUtils.Locator.documentation_link_path, eaSmartPostListUtils.TEXT.documentation_page);
			
//			Config.closeNotifications.floatNotification(driver);
//			Config.closeNotifications.betterdocs(driver);
			Config.closeNotifications.notificationBar(driver);
			
			Thread.sleep(1000);

			WebElement all_tab = driver.findElement(By.xpath(eaSmartPostListUtils.Locator.all_tab_xpath));
			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,1106)", "");
			js.executeScript("arguments[0].scrollIntoView();", all_tab);
			
			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.all_tab_xpath)).click();
			Thread.sleep(5000);
			softassert.assertEquals(driver.findElement(By.xpath(eaSmartPostListUtils.Locator.all_tab_post_1_xpath)).getText(),
					eaSmartPostListUtils.TEXT.all_tab_post_1_text);

			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.elementor_tab_xpath)).click();
			Thread.sleep(5000);
			softassert.assertEquals(
					driver.findElement(By.xpath(eaSmartPostListUtils.Locator.elementor_tab_post_1_xpath)).getText(),
					eaSmartPostListUtils.TEXT.elementor_tab_post_1_text);

			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.ea_tab_xpath)).click();
			Thread.sleep(5000);
			softassert.assertEquals(driver.findElement(By.xpath(eaSmartPostListUtils.Locator.ea_tab_post_1_xpath)).getText(),
					eaSmartPostListUtils.TEXT.ea_tab_post_1_xpath);

			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.wordpress_tab_xpath)).click();
			Thread.sleep(5000);
			softassert.assertEquals(
					driver.findElement(By.xpath(eaSmartPostListUtils.Locator.wordpress_tab_post_1_xpath)).getText(),
					eaSmartPostListUtils.TEXT.wordpress_tab_post_1_text);
			
			softassert.assertAll();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
