package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaSmartPostListUtils;

public class EaSmartPostList {
	public static void eaSmartPostList(WebDriver driver) {

		try {
//				assertEquals(driver.getTitle(), eaSmartPostListUtils.TEXT.smartpostlist_page_title);
//				System.out.println("Page title passed !!");
//				
//				driver.findElement(By.xpath(eaSmartPostListUtils.Locator.documentation_link_path)).click();
//				
//				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//				driver.switchTo().window(tabs2.get(1));
//				
//				assertEquals(driver.findElement(By.id(eaSmartPostListUtils.Locator.documentation_title_id)).getText(), eaSmartPostListUtils.TEXT.documentation_page);
//				System.out.println("Documentation link passed !!");
//				driver.close();
//				
//				driver.switchTo().window(tabs2.get(0));
////			
//				Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1106)", "");

			// ALL TAB
			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.all_tab_xpath)).click();
			Thread.sleep(3000);
			String all_tab_title = driver.findElement(By.xpath(eaSmartPostListUtils.Locator.all_tab_post_1_xpath))
					.getText();
			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.all_tab_post_1_xpath)).click();
			Thread.sleep(2000);
			assertEquals(driver.findElement(By.xpath(eaSmartPostListUtils.Locator.all_tab_title_xpath)).getText(),
					all_tab_title);
			System.out.println("All tab passed !!");
			driver.navigate().back();

			// ELEMENTOR TAB

			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.elementor_tab_xpath)).click();
			Thread.sleep(3000);
			String elementor_tab_title = driver
					.findElement(By.xpath(eaSmartPostListUtils.Locator.elementor_tab_post_1_xpath)).getText();
			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.elementor_tab_post_1_xpath)).click();
			assertEquals(driver.findElement(By.xpath(eaSmartPostListUtils.Locator.all_tab_title_xpath)).getText(),
					elementor_tab_title);
			System.out.println("Elementor tab passed !!");
			driver.navigate().back();

			// ESSENTIAL ADDONS

			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.ea_tab_xpath)).click();
			Thread.sleep(3000);
			String ea_tab_title = driver.findElement(By.xpath(eaSmartPostListUtils.Locator.ea_tab_post_1_xpath))
					.getText();
			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.ea_tab_post_1_xpath)).click();
			assertEquals(driver.findElement(By.xpath(eaSmartPostListUtils.Locator.all_tab_title_xpath)).getText(),
					ea_tab_title);
			System.out.println("EA tab passed !!");
			driver.navigate().back();

			// WORDPRESS
			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.wordpress_tab_xpath)).click();
			Thread.sleep(3000);
			String wordpress_tab_title = driver
					.findElement(By.xpath(eaSmartPostListUtils.Locator.wordpress_tab_post_1_xpath)).getText();
			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.wordpress_tab_post_1_xpath)).click();
			assertEquals(driver.findElement(By.xpath(eaSmartPostListUtils.Locator.all_tab_title_xpath)).getText(),
					wordpress_tab_title);
			System.out.println("Wordpress tab passed !!");
			driver.navigate().back();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaSmartPostList(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
//			assertEquals(driver.getTitle(), eaSmartPostListUtils.TEXT.smartpostlist_page_title);
//			System.out.println("Page title passed !!");
//			
//			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.documentation_link_path)).click();
//			
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaSmartPostListUtils.Locator.documentation_title_id)).getText(), eaSmartPostListUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs2.get(0));
////		
//			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1106)", "");

			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.all_tab_xpath)).click();
			Thread.sleep(5000);
			assertEquals(driver.findElement(By.xpath(eaSmartPostListUtils.Locator.all_tab_post_1_xpath)).getText(),
					eaSmartPostListUtils.TEXT.all_tab_post_1_text);
			System.out.println("All tab passed !!");

			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.elementor_tab_xpath)).click();
			Thread.sleep(5000);
			assertEquals(
					driver.findElement(By.xpath(eaSmartPostListUtils.Locator.elementor_tab_post_1_xpath)).getText(),
					eaSmartPostListUtils.TEXT.elementor_tab_post_1_text);
			System.out.println("Elementor tab passed !!");

			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.ea_tab_xpath)).click();
			Thread.sleep(5000);
			assertEquals(driver.findElement(By.xpath(eaSmartPostListUtils.Locator.ea_tab_post_1_xpath)).getText(),
					eaSmartPostListUtils.TEXT.ea_tab_post_1_xpath);
			System.out.println("EA tab passed !!");

			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.wordpress_tab_xpath)).click();
			Thread.sleep(5000);
			assertEquals(
					driver.findElement(By.xpath(eaSmartPostListUtils.Locator.wordpress_tab_post_1_xpath)).getText(),
					eaSmartPostListUtils.TEXT.wordpress_tab_post_1_text);
			System.out.println("Wordpress tab passed !!");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
