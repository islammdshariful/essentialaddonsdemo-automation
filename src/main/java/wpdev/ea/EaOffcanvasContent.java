package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaOffcanvasContentUtils;

public class EaOffcanvasContent {
	public static void eaOffcanvasContent(WebDriver driver) {
		try {
//				assertEquals(driver.getTitle(), eaOffcanvasContentUtils.TEXT.offcanvas_page_title);
//				System.out.println("Page title passed !!");
//				
//				driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.documentation_link_path)).click();
//				
//				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//				driver.switchTo().window(tabs2.get(1));
//				
//				assertEquals(driver.findElement(By.id(eaOffcanvasContentUtils.Locator.documentation_title_id)).getText(), eaOffcanvasContentUtils.TEXT.documentation_page);
//				System.out.println("Documentation link passed !!");
//				driver.close();
//				
//				driver.switchTo().window(tabs2.get(0));
////			
//				Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1047)", "");

			// LEFT SIDE CONVAS
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_button_xpath)).getText(),
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
			assertEquals(
					driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_home_xpath)).getText(),
					eaOffcanvasContentUtils.TEXT.side_canvas_home_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_about_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_about_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_services_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_service_text);
			assertEquals(
					driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_blog_xpath)).getText(),
					eaOffcanvasContentUtils.TEXT.side_canvas_blog_text);
			assertEquals(
					driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_faq_xpath)).getText(),
					eaOffcanvasContentUtils.TEXT.side_canvas_faq_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_contact_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_contact_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_convas_button_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_convas_button_text);

			driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.click_xpath)).click();

			// RIGHT SIDE CONVAS
			assertEquals(
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
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_home_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_home_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_about_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_about_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_services_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_service_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_blog_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_blog_text);
			assertEquals(
					driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_faq_xpath)).getText(),
					eaOffcanvasContentUtils.TEXT.side_canvas_faq_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_contact_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_contact_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_convas_button_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_convas_button_text);

			driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.click_xpath)).click();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaOffcanvasContent(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
//			assertEquals(driver.getTitle(), eaOffcanvasContentUtils.TEXT.offcanvas_page_title);
//			System.out.println("Page title passed !!");
//			
//			driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.documentation_link_path)).click();
//			
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaOffcanvasContentUtils.Locator.documentation_title_id)).getText(), eaOffcanvasContentUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs2.get(0));
////		
//			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1200)", "");

			// LEFT SIDE CONVAS
//			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_button_xpath)).getText(), eaOffcanvasContentUtils.TEXT.left_side_button_text);
			js.executeScript("window.scrollBy(0,1300)", "");
			driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_button_xpath)).click();
			Thread.sleep(3000);
			WebElement left_canvas_image = driver
					.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_image_xpath));
			if (left_canvas_image.isDisplayed()) {
				System.out.println("Left canvas image passed !!");
			} else {
				System.out.println("Left canvas image failed !!");
			}
			assertEquals(
					driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_home_xpath)).getText(),
					eaOffcanvasContentUtils.TEXT.side_canvas_home_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_about_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_about_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_services_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_service_text);
			assertEquals(
					driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_blog_xpath)).getText(),
					eaOffcanvasContentUtils.TEXT.side_canvas_blog_text);
			assertEquals(
					driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_faq_xpath)).getText(),
					eaOffcanvasContentUtils.TEXT.side_canvas_faq_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_canvas_contact_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_contact_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.left_side_convas_button_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_convas_button_text);

			driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.click_xpath)).click();

			// RIGHT SIDE CONVAS
			assertEquals(
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
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_home_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_home_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_about_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_about_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_services_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_service_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_blog_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_blog_text);
			assertEquals(
					driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_faq_xpath)).getText(),
					eaOffcanvasContentUtils.TEXT.side_canvas_faq_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_canvas_contact_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_canvas_contact_text);
			assertEquals(driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.right_side_convas_button_xpath))
					.getText(), eaOffcanvasContentUtils.TEXT.side_convas_button_text);

			driver.findElement(By.xpath(eaOffcanvasContentUtils.Locator.click_xpath)).click();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
