package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaToggleUtils;

public class EaToggle {

	public static void eaToggle(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaToggleUtils.TEXT.toggle_page_title,
					eaToggleUtils.Locator.documentation_link_xpath, eaToggleUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,1192); behavior:'smooth';", "");
			WebElement element = driver.findElement(By.xpath("//*[@id=\"post-2605\"]/div/div/div/div/section[2]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/h3"));
			js.executeScript("arguments[0].scrollIntoView();", element);
			
			// Limited - Unlimited toggle button
			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.limited_basic_text_xpath)).getText(),
					eaToggleUtils.TEXT.limited__basic);
			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.limited_standard_text_xpath)).getText(),
					eaToggleUtils.TEXT.limited__standard);
			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.limited_enterprise_text_xpath)).getText(),
					eaToggleUtils.TEXT.limited__enterprise);

			System.out.println("Limited Toggle passed !!");

			Thread.sleep(1000);
			driver.findElement(By.xpath(eaToggleUtils.Locator.toggle_button_xpath)).click();
			Thread.sleep(1000);
			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.unlimited_1_website_text_xpath)).getText(),
					eaToggleUtils.TEXT.unlimited_1_website);
			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.unlimited_2_website_text_xpath)).getText(),
					eaToggleUtils.TEXT.unlimited_3_ebsites);
			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.unlimited_website_text_xpath)).getText(),
					eaToggleUtils.TEXT.unlimited_website);

			System.out.println("Unimited Toggle passed !!");
//
//			// Single - Unlimited toggle button
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.single_text_xpath)).getText(),
//					eaToggleUtils.TEXT.single_text);
//			System.out.println("Single Toggle passed !!");
//			driver.findElement(By.xpath(eaToggleUtils.Locator.single_toggle_button_xpath)).click();
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.unlimited_text_xpath)).getText(),
//					eaToggleUtils.TEXT.unlimited_text);
//			System.out.println("Unlimited Toggle passed !!");
//
//			// DATA TABLE - COMPARISON TABLE BUTTON
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.day_text_xpath)).getText(),
//					eaToggleUtils.TEXT.day_text);
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.time_text_xpath)).getText(),
//					eaToggleUtils.TEXT.time_text);
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.class_text_xpath)).getText(),
//					eaToggleUtils.TEXT.class_text);
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.instructor_text_xpath)).getText(),
//					eaToggleUtils.TEXT.intructor_text);
//
//			System.out.println("Datatable Toggle passed !!");
//
//			driver.findElement(By.xpath(eaToggleUtils.Locator.data_table_toggle_button_xpath)).click();
//			Thread.sleep(1000);
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.feature_text_xpath)).getText(),
//					eaToggleUtils.TEXT.feature_text);
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.elementor_text_xpath)).getText(),
//					eaToggleUtils.TEXT.elementor_text);
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.elementor_pro_text_xpath)).getText(),
//					eaToggleUtils.TEXT.elementor_pro_text);
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.elementor_gold_text_xpath)).getText(),
//					eaToggleUtils.TEXT.elementor_gold_text);
//
//			System.out.println("Comparision Toggle passed !!");
//			// CURRENT FEATURE - UPCOMMING FEATURE TOGGLE BUTTON
//
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.info_box_text_xpath)).getText(),
//					eaToggleUtils.TEXT.info_box_text);
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.advanced_tabs_text_xpath)).getText(),
//					eaToggleUtils.TEXT.advance_tabs_text);
//
//			System.out.println("current feature Toggle passed !!");
//			driver.findElement(By.xpath(eaToggleUtils.Locator.current_feature_toggle_button_xpath)).click();
//			Thread.sleep(1000);
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.creative_button_text_xpath)).getText(),
//					eaToggleUtils.TEXT.creative_text);
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.content_ticker_text_xpath)).getText(),
//					eaToggleUtils.TEXT.content_text);
//
//			System.out.println("upcomming feature Toggle passed !!");
//
//			driver.findElement(By.xpath(eaToggleUtils.Locator.get_stared_link_xpath)).click();
//			Thread.sleep(1000);
//			softassert.assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.pricing_text_xpath)).getText(),
//					eaToggleUtils.TEXT.pricing_text);
//
//			System.out.println("Get stared page passed !!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
