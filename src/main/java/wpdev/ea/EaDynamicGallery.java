package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaContentTimelineUtils;
import wpdev.ea.utils.eaDynamicGalleryUtils;

public class EaDynamicGallery {
	public static void eaDynamicGallery(WebDriver driver, String pageurl) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + pageurl);

		try {

			Config.checkdocandheadtitle.checkdoc(driver, eaDynamicGalleryUtils.TEXT.daynamicgallery_page_title,
					eaDynamicGalleryUtils.Locator.documentation_link_path,
					eaDynamicGalleryUtils.TEXT.documentation_page);

//			Config.closeNotifications.floatNotification(driver);
			
//			driver.findElement(By.xpath("/div/div/span")).click();
//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
			


			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1010)", "");

			Thread.sleep(2000);
			// ALL TAB
			driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.all_tab_xpath)).click();
			Thread.sleep(2000);
			String all_title = driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.all_tab_header_xpath))
					.getText();
			System.out.println(all_title);
			driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.all_tab_header_xpath)).click();
			softassert.assertEquals(
					driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.all_tab_page_xpath)).getText(),
					all_title);
			System.out.println("All Header Passed");
			driver.navigate().back();
//			assertEquals(driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.all_tab_header_xpath)).getText(), eaDynamicGalleryUtils.TEXT.all_tab_header_text);
//			assertEquals(driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.all_tab_des_xpath)).getText(), eaDynamicGalleryUtils.TEXT.all_tab_des_text);
//			WebElement all_tab_image = driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.all_tab_image_xpath));
//			if(all_tab_image.isDisplayed()) {
//				System.out.println("All tab image passed !!");
//			}

			// ELEMENTOR TAB
			driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.elementor_tab_xpath)).click();
			Thread.sleep(2000);
			String elementor_title = driver
					.findElement(By.xpath(eaDynamicGalleryUtils.Locator.elementor_tab_header_xpath)).getText();
			driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.elementor_tab_header_xpath)).click();
			softassert.assertEquals(
					driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.all_tab_page_xpath)).getText(),
					elementor_title);
			System.out.println("Elementor Header Passed");
			driver.navigate().back();
//			assertEquals(driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.elementor_tab_header_xpath)).getText(), eaDynamicGalleryUtils.TEXT.elementor_tab_header_text);
//			assertEquals(driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.elementor_tab_des_xpath)).getText(), eaDynamicGalleryUtils.TEXT.elementor_tab_des_text);
//			WebElement elementor_tab_image = driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.elementor_tab_image_xpath));
//			if(elementor_tab_image.isDisplayed()) {
//				System.out.println("Elementor tab image passed !!");
//			}

			// WORDPRESS TAB
			driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.wordpress_tab_xpath)).click();
			Thread.sleep(2000);
			String wordpress_title = driver
					.findElement(By.xpath(eaDynamicGalleryUtils.Locator.wordpress_tab_header_xpath)).getText();
			driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.wordpress_tab_header_xpath)).click();
			assertEquals(driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.all_tab_page_xpath)).getText(),
					wordpress_title);
			System.out.println("Wordpress Header Passed");
			driver.navigate().back();

			// TEMPLATES TAB
			driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.templates_tab_xpath)).click();
			Thread.sleep(2000);
			String templates_title = driver
					.findElement(By.xpath(eaDynamicGalleryUtils.Locator.wordpress_tab_header_xpath)).getText();
			driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.templates_tab_header_xpath)).click();
			softassert.assertEquals(
					driver.findElement(By.xpath(eaDynamicGalleryUtils.Locator.all_tab_page_xpath)).getText(),
					templates_title);
			System.out.println("Templates Header Passed");
			driver.navigate().back();

			Thread.sleep(1000);
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
