package testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import utils.eaDividerUtils;
import utils.eaStaticProductUtils;

public class EaStaticProduct {
	public static void eaStaticProduct(WebDriver driver, String url) {

		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaStaticProductUtils.TEXT.staticproduct_page_title,
					eaStaticProductUtils.Locator.documentation_link_path, eaStaticProductUtils.TEXT.documentation_page);

//			Config.closeNotifications.floatNotification(driver);
//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1144); behavior:'smooth';", "");
			Thread.sleep(2000);
			// FIRST PRODUCT
			softassert.assertEquals(driver.findElement(By.xpath(eaStaticProductUtils.Locator.first_product_description_xpath))
					.getText(), eaStaticProductUtils.TEXT.first_product_description_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaStaticProductUtils.Locator.first_product_price_xpath)).getText(),
					eaStaticProductUtils.TEXT.first_product_price_text);
			softassert.assertEquals(
					driver.findElement(By.xpath(eaStaticProductUtils.Locator.first_product_review_xpath)).getText(),
					eaStaticProductUtils.TEXT.first_product_review_text);
			softassert.assertEquals(
					driver.findElement(By.xpath(eaStaticProductUtils.Locator.first_prodcut_button_xpath)).getText(),
					eaStaticProductUtils.TEXT.first_prodcut_button_text);
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
