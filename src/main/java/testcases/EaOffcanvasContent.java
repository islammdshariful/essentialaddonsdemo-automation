package testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import utils.eaDividerUtils;
import utils.eaOffcanvasContentUtils;

public class EaOffcanvasContent {
	public static void eaOffcanvasContent(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaOffcanvasContentUtils.TEXT.offcanvas_page_title,
					eaOffcanvasContentUtils.Locator.documentation_link_path, eaOffcanvasContentUtils.TEXT.documentation_page);
			
//			Config.closeNotifications.floatNotification(driver);
//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
			
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1050)", "");

			// LEFT SIDE CONVAS
			Thread.sleep(1000);
			softassert.assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_button_xpath)).getText(),
					eaOffcanvasContentUtils.TEXT.left_side_button_text);
			
			driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_button_xpath)).click();
			Thread.sleep(3000);
			WebElement left_canvas_image = driver
					.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_image_xpath));
			if (left_canvas_image.isDisplayed()) {
				System.out.println("Left canvas image passed !!");
			} else {
				System.out.println("Left canvas image failed !!");
			}
			softassert.assertEquals(
					driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_home_xpath)).getText(),
					eaOffcanvasContentUtils.TEXT.side_canvas_home_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_about_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_about_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_services_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_service_text);
			softassert.assertEquals(
					driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_blog_xpath)).getText(),
					eaOffcanvasContentUtils.TEXT.side_canvas_blog_text);
			softassert.assertEquals(
					driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_faq_xpath)).getText(),
					eaOffcanvasContentUtils.TEXT.side_canvas_faq_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_contact_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_contact_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_convas_button_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_convas_button_text);

			driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.click_xpath)).click();

			// RIGHT SIDE CONVAS
			softassert.assertEquals(
					driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_button_xpath)).getText(),
					eaOffcanvasContentUtils.TEXT.right_side_button_text);
			driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_button_xpath)).click();
			Thread.sleep(3000);
			WebElement right_canvas_image = driver
					.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_image_xpath));
			if (right_canvas_image.isDisplayed()) {
				System.out.println("Right canvas image passed !!");
			} else {
				System.out.println("Right canvas image failed !!");
			}
			softassert.assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_home_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_home_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_about_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_about_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_services_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_service_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_blog_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_blog_text);
			softassert.assertEquals(
					driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_faq_xpath)).getText(),
					eaOffcanvasContentUtils.TEXT.side_canvas_faq_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_contact_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_contact_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_convas_button_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_convas_button_text);

			driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.click_xpath)).click();
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
