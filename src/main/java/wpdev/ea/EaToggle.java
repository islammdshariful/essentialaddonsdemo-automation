package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaToggleUtils;

public class EaToggle {

	public static void eaToggle(WebDriver driver) {

		try {
			assertEquals(driver.getTitle(), eaToggleUtils.TEXT.toggle_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaToggleUtils.Locator.documentation_link_xpath)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaToggleUtils.Locator.documentation_title_id)).getText(),
					eaToggleUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));

			Thread.sleep(1000);

			// Limited - Unlimited toggle button
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.limited_basic_text_xpath)).getText(),
					eaToggleUtils.TEXT.limited__basic);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.limited_standard_text_xpath)).getText(),
					eaToggleUtils.TEXT.limited__standard);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.limited_enterprise_text_xpath)).getText(),
					eaToggleUtils.TEXT.limited__enterprise);

			System.out.println("Limited Toggle passed !!");

			driver.findElement(By.xpath(eaToggleUtils.Locator.toggle_button_xpath)).click();
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.unlimited_1_website_text_xpath)).getText(),
					eaToggleUtils.TEXT.unlimited_1_website);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.unlimited_2_website_text_xpath)).getText(),
					eaToggleUtils.TEXT.unlimited_3_ebsites);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.unlimited_website_text_xpath)).getText(),
					eaToggleUtils.TEXT.unlimited_website);

			System.out.println("Unimited Toggle passed !!");

			// Single - Unlimited toggle button
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.single_text_xpath)).getText(),
					eaToggleUtils.TEXT.single_text);
			System.out.println("Single Toggle passed !!");
			driver.findElement(By.xpath(eaToggleUtils.Locator.single_toggle_button_xpath)).click();
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.unlimited_text_xpath)).getText(),
					eaToggleUtils.TEXT.unlimited_text);
			System.out.println("Unlimited Toggle passed !!");

			// DATA TABLE - COMPARISON TABLE BUTTON
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.day_text_xpath)).getText(),
					eaToggleUtils.TEXT.day_text);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.time_text_xpath)).getText(),
					eaToggleUtils.TEXT.time_text);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.class_text_xpath)).getText(),
					eaToggleUtils.TEXT.class_text);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.instructor_text_xpath)).getText(),
					eaToggleUtils.TEXT.intructor_text);

			System.out.println("Datatable Toggle passed !!");

			driver.findElement(By.xpath(eaToggleUtils.Locator.data_table_toggle_button_xpath)).click();
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.feature_text_xpath)).getText(),
					eaToggleUtils.TEXT.feature_text);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.elementor_text_xpath)).getText(),
					eaToggleUtils.TEXT.elementor_text);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.elementor_pro_text_xpath)).getText(),
					eaToggleUtils.TEXT.elementor_pro_text);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.elementor_gold_text_xpath)).getText(),
					eaToggleUtils.TEXT.elementor_gold_text);

			System.out.println("Comparision Toggle passed !!");
			// CURRENT FEATURE - UPCOMMING FEATURE TOGGLE BUTTON

			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.info_box_text_xpath)).getText(),
					eaToggleUtils.TEXT.info_box_text);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.advanced_tabs_text_xpath)).getText(),
					eaToggleUtils.TEXT.advance_tabs_text);

			System.out.println("current feature Toggle passed !!");
			driver.findElement(By.xpath(eaToggleUtils.Locator.current_feature_toggle_button_xpath)).click();
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.creative_button_text_xpath)).getText(),
					eaToggleUtils.TEXT.creative_text);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.content_ticker_text_xpath)).getText(),
					eaToggleUtils.TEXT.content_text);

			System.out.println("upcomming feature Toggle passed !!");

			driver.findElement(By.xpath(eaToggleUtils.Locator.get_stared_link_xpath)).click();
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.pricing_text_xpath)).getText(),
					eaToggleUtils.TEXT.pricing_text);

			System.out.println("Get stared page passed !!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaToggle(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
//			assertEquals(driver.getTitle(), eaToggleUtils.TEXT.toggle_page_title);
//			System.out.println("Page title passed !!");
//			
//			driver.findElement(By.xpath(eaToggleUtils.Locator.documentation_link_xpath)).click();
//					
//			
//
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaToggleUtils.Locator.documentation_title_id)).getText(), eaToggleUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs2.get(0));

//			Thread.sleep(2000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1144)", "");

			Thread.sleep(3000);

			// Limited - Unlimited toggle button
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.limited_basic_text_xpath)).getText(),
					eaToggleUtils.TEXT.limited__basic);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.limited_standard_text_xpath)).getText(),
					eaToggleUtils.TEXT.limited__standard);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.limited_enterprise_text_xpath)).getText(),
					eaToggleUtils.TEXT.limited__enterprise);

			System.out.println("Limited Toggle passed !!");

//			js.executeScript("window.scrollBy(0,1144)", "");
			Thread.sleep(5000);

			driver.findElement(By.xpath(eaToggleUtils.Locator.toggle_button_xpath)).click();
			Thread.sleep(3000);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.unlimited_1_website_text_xpath)).getText(),
					eaToggleUtils.TEXT.unlimited_1_website);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.unlimited_2_website_text_xpath)).getText(),
					eaToggleUtils.TEXT.unlimited_3_ebsites);
			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.unlimited_website_text_xpath)).getText(),
					eaToggleUtils.TEXT.unlimited_website);

			System.out.println("Unimited Toggle passed !!");

			// need update -----------------------------------------
//			
//			//Single - Unlimited toggle button
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.single_text_xpath)).getText(), eaToggleUtils.TEXT.single_text);
//			System.out.println("Single Toggle passed !!");
//			driver.findElement(By.xpath(eaToggleUtils.Locator.single_toggle_button_xpath)).click();
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.unlimited_text_xpath)).getText(), eaToggleUtils.TEXT.unlimited_text);
//			System.out.println("Unlimited Toggle passed !!");
//			
//			//DATA TABLE - COMPARISON TABLE BUTTON
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.day_text_xpath)).getText(), eaToggleUtils.TEXT.day_text);
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.time_text_xpath)).getText(), eaToggleUtils.TEXT.time_text);
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.class_text_xpath)).getText(), eaToggleUtils.TEXT.class_text);
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.instructor_text_xpath)).getText(), eaToggleUtils.TEXT.intructor_text);
//			
//			System.out.println("Datatable Toggle passed !!");
//			
//			
//			driver.findElement(By.xpath(eaToggleUtils.Locator.data_table_toggle_button_xpath)).click();
//			Thread.sleep(3000);
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.feature_text_xpath)).getText(), eaToggleUtils.TEXT.feature_text);
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.elementor_text_xpath)).getText(), eaToggleUtils.TEXT.elementor_text);
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.elementor_pro_text_xpath)).getText(), eaToggleUtils.TEXT.elementor_pro_text);
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.elementor_gold_text_xpath)).getText(), eaToggleUtils.TEXT.elementor_gold_text);
//			
//			System.out.println("Comparision Toggle passed !!");
//			// CURRENT FEATURE - UPCOMMING FEATURE TOGGLE BUTTON
//
//			
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.info_box_text_xpath)).getText(), eaToggleUtils.TEXT.info_box_text);
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.advanced_tabs_text_xpath)).getText(), eaToggleUtils.TEXT.advance_tabs_text);
//			
//			System.out.println("current feature Toggle passed !!");
//			driver.findElement(By.xpath(eaToggleUtils.Locator.current_feature_toggle_button_xpath)).click();
//			Thread.sleep(3000);
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.creative_button_text_xpath)).getText(), eaToggleUtils.TEXT.creative_text);
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.content_ticker_text_xpath)).getText(), eaToggleUtils.TEXT.content_text);
//
//			System.out.println("upcomming feature Toggle passed !!");
//			
//			driver.findElement(By.xpath(eaToggleUtils.Locator.get_stared_link_xpath)).click();
//			Thread.sleep(3000);
//			assertEquals(driver.findElement(By.xpath(eaToggleUtils.Locator.pricing_text_xpath)).getText(), eaToggleUtils.TEXT.pricing_text);
//
//			System.out.println("Get stared page passed !!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
