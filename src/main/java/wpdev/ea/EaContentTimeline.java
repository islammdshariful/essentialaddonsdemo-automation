package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaContentTimelineUtils;

public class EaContentTimeline {
	public static void eaontentTimeline(WebDriver driver) {

		try {
//				assertEquals(driver.getTitle(), eaContentTimelineUtils.TEXT.contenttimeline_page_title);
//				System.out.println("Page title passed !!");
//				
//				driver.findElement(By.xpath(eaContentTimelineUtils.Locator.documentation_link_path)).click();
//				
//				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//				driver.switchTo().window(tabs2.get(1));
//				
//				assertEquals(driver.findElement(By.id(eaContentTimelineUtils.Locator.documentation_title_id)).getText(), eaContentTimelineUtils.TEXT.documentation_page);
//				System.out.println("Documentation link passed !!");
//				driver.close();
//				
//				driver.switchTo().window(tabs2.get(0));
//				
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1103)", "");
			WebElement icon_1 = driver.findElement(By.xpath(eaContentTimelineUtils.Locator.first_content_icon_xpath));
			if (icon_1.isDisplayed()) {
				System.out.println("First icon passed!!");
			}
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.first_content_date_xpath)).getText(),
					eaContentTimelineUtils.TEXT.first_content_date_text);
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.first_content_header_xpath)).getText(),
					eaContentTimelineUtils.TEXT.first_content_header_text);
			assertEquals(driver.findElement(By.xpath(eaContentTimelineUtils.Locator.first_content_des_xpath)).getText(),
					eaContentTimelineUtils.TEXT.first_content_des_text);
			System.out.println("First passed!!");

			js.executeScript("window.scrollBy(0,1405)", "");
			WebElement icon_2 = driver.findElement(By.xpath(eaContentTimelineUtils.Locator.second_content_icon_xpath));
			if (icon_2.isDisplayed()) {
				System.out.println("Second icon passed!!");
			}
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.second_content_date_xpath)).getText(),
					eaContentTimelineUtils.TEXT.second_content_date_text);
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.second_content_header_xpath)).getText(),
					eaContentTimelineUtils.TEXT.second_content_header_text);
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.second_content_des_xpath)).getText(),
					eaContentTimelineUtils.TEXT.second_content_des_text);
			System.out.println("Second passed!!");

			js.executeScript("window.scrollBy(0,1505)", "");
			WebElement icon_3 = driver.findElement(By.xpath(eaContentTimelineUtils.Locator.third_content_icon_xpath));
			if (icon_3.isDisplayed()) {
				System.out.println("Third icon passed!!");
			}
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.third_content_date_xpath)).getText(),
					eaContentTimelineUtils.TEXT.third_content_date_text);
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.third_content_header_xpath)).getText(),
					eaContentTimelineUtils.TEXT.third_content_header_text);
			assertEquals(driver.findElement(By.xpath(eaContentTimelineUtils.Locator.third_content_des_xpath)).getText(),
					eaContentTimelineUtils.TEXT.third_content_des_text);
			System.out.println("Third passed!!");

//				js.executeScript("window.scrollBy(0,1605)", "");
			WebElement icon_4 = driver.findElement(By.xpath(eaContentTimelineUtils.Locator.fourth_content_icon_xpath));
			if (icon_3.isDisplayed()) {
				System.out.println("Fourth icon passed!!");
			}
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.fourth_content_date_xpath)).getText(),
					eaContentTimelineUtils.TEXT.fourth_content_date_text);
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.fourth_content_header_xpath)).getText(),
					eaContentTimelineUtils.TEXT.fourth_content_header_text);
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.fourth_content_des_xpath)).getText(),
					eaContentTimelineUtils.TEXT.fourth_content_des_text);
			System.out.println("Fourth passed!!");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaontentTimeline(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
//			assertEquals(driver.getTitle(), eaContentTimelineUtils.TEXT.contenttimeline_page_title);
//			System.out.println("Page title passed !!");
//			
//			driver.findElement(By.xpath(eaContentTimelineUtils.Locator.documentation_link_path)).click();
//			
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaContentTimelineUtils.Locator.documentation_title_id)).getText(), eaContentTimelineUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs2.get(0));
//			
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1103)", "");
			WebElement icon_1 = driver.findElement(By.xpath(eaContentTimelineUtils.Locator.first_content_icon_xpath));
			if (icon_1.isDisplayed()) {
				System.out.println("First icon passed!!");
			}
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.first_content_date_xpath)).getText(),
					eaContentTimelineUtils.TEXT.first_content_date_text);
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.first_content_header_xpath)).getText(),
					eaContentTimelineUtils.TEXT.first_content_header_text);
			assertEquals(driver.findElement(By.xpath(eaContentTimelineUtils.Locator.first_content_des_xpath)).getText(),
					eaContentTimelineUtils.TEXT.first_content_des_text);
			System.out.println("First passed!!");

			js.executeScript("window.scrollBy(0,1405)", "");
			WebElement icon_2 = driver.findElement(By.xpath(eaContentTimelineUtils.Locator.second_content_icon_xpath));
			if (icon_2.isDisplayed()) {
				System.out.println("Second icon passed!!");
			}
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.second_content_date_xpath)).getText(),
					eaContentTimelineUtils.TEXT.second_content_date_text);
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.second_content_header_xpath)).getText(),
					eaContentTimelineUtils.TEXT.second_content_header_text);
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.second_content_des_xpath)).getText(),
					eaContentTimelineUtils.TEXT.second_content_des_text);
			System.out.println("Second passed!!");

			js.executeScript("window.scrollBy(0,1505)", "");
			WebElement icon_3 = driver.findElement(By.xpath(eaContentTimelineUtils.Locator.third_content_icon_xpath));
			if (icon_3.isDisplayed()) {
				System.out.println("Third icon passed!!");
			}
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.third_content_date_xpath)).getText(),
					eaContentTimelineUtils.TEXT.third_content_date_text);
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.third_content_header_xpath)).getText(),
					eaContentTimelineUtils.TEXT.third_content_header_text);
			assertEquals(driver.findElement(By.xpath(eaContentTimelineUtils.Locator.third_content_des_xpath)).getText(),
					eaContentTimelineUtils.TEXT.third_content_des_text);
			System.out.println("Third passed!!");

//			js.executeScript("window.scrollBy(0,1605)", "");
			WebElement icon_4 = driver.findElement(By.xpath(eaContentTimelineUtils.Locator.fourth_content_icon_xpath));
			if (icon_3.isDisplayed()) {
				System.out.println("Fourth icon passed!!");
			}
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.fourth_content_date_xpath)).getText(),
					eaContentTimelineUtils.TEXT.fourth_content_date_text);
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.fourth_content_header_xpath)).getText(),
					eaContentTimelineUtils.TEXT.fourth_content_header_text);
			assertEquals(
					driver.findElement(By.xpath(eaContentTimelineUtils.Locator.fourth_content_des_xpath)).getText(),
					eaContentTimelineUtils.TEXT.fourth_content_des_text);
			System.out.println("Fourth passed!!");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
