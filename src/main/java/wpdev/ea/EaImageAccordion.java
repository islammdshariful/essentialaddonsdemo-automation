package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaImageAccordionUtils;

public class EaImageAccordion {

	public static void eaImageAccordion(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {

			Config.checkdocandheadtitle.checkdoc(driver, eaImageAccordionUtils.TEXT.imageaccordion_title,
					eaImageAccordionUtils.Locator.documentation_link_path,
					eaImageAccordionUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,2000); behavior:'smooth';", "");
			WebElement element = driver.findElement(By.xpath(
					"/html/body/div[3]/div[2]/div/div/div/main/article/div/div/div/div/section[2]/div/div/div/div/div/section/div/div/div/div/div/div[2]/div/div"));
			js.executeScript("arguments[0].scrollIntoView();", element);

			Actions cursor = new Actions(driver);

			// IMAGE PATH
			WebElement first_image = driver.findElement(By.xpath(eaImageAccordionUtils.Locator.first_image_path_xpath));
			WebElement second_image = driver
					.findElement(By.xpath(eaImageAccordionUtils.Locator.second_image_path_xpath));
			WebElement third_image = driver.findElement(By.xpath(eaImageAccordionUtils.Locator.third_image_path_xpath));
			WebElement fourth_image = driver
					.findElement(By.xpath(eaImageAccordionUtils.Locator.fourth_image_path_xpath));
			WebElement fifth_image = driver.findElement(By.xpath(eaImageAccordionUtils.Locator.fifth_image_path_xpath));

			// IAMGE HEADER
			WebElement first_header = driver
					.findElement(By.xpath(eaImageAccordionUtils.Locator.first_image_header_xpath));
			WebElement second_header = driver
					.findElement(By.xpath(eaImageAccordionUtils.Locator.second_image_header_xpath));
			WebElement third_header = driver
					.findElement(By.xpath(eaImageAccordionUtils.Locator.third_image_header_xpath));
			WebElement fourth_header = driver
					.findElement(By.xpath(eaImageAccordionUtils.Locator.fourth_image_header_xpath));
			WebElement fifth_header = driver
					.findElement(By.xpath(eaImageAccordionUtils.Locator.fifth_image_header_xpath));

			// IMAGE DESCRIPTION
			WebElement first_des = driver.findElement(By.xpath(eaImageAccordionUtils.Locator.first_image_des_xpath));
			WebElement second_des = driver.findElement(By.xpath(eaImageAccordionUtils.Locator.second_image_des_xpath));
			WebElement third_des = driver.findElement(By.xpath(eaImageAccordionUtils.Locator.third_image_des_xpath));
			WebElement fourth_des = driver.findElement(By.xpath(eaImageAccordionUtils.Locator.fourth_image_des_xpath));
			WebElement fifth_des = driver.findElement(By.xpath(eaImageAccordionUtils.Locator.fifth_image_des_xpath));

			// FIRST ACCORDION
			Thread.sleep(2000);
			cursor.moveToElement(first_image).build().perform();
			Thread.sleep(2000);
			if (first_header.isDisplayed()) {
				if (!second_header.isDisplayed() && !third_header.isDisplayed() && !fourth_header.isDisplayed()
						&& !fifth_header.isDisplayed()) {
					softassert.assertEquals(first_header.getText(), eaImageAccordionUtils.TEXT.first_image_header_text);
					softassert.assertEquals(first_des.getText(), eaImageAccordionUtils.TEXT.first_image_des_text);
					System.out.println("First Image Accordion Passed !!");
				}
			}

			// SECOND ACCORDION
			cursor.moveToElement(second_image).build().perform();
			Thread.sleep(2000);
			if (second_header.isDisplayed()) {
				if (!first_header.isDisplayed() && !third_header.isDisplayed() && !fourth_header.isDisplayed()
						&& !fifth_header.isDisplayed()) {
					softassert.assertEquals(second_header.getText(),
							eaImageAccordionUtils.TEXT.second_image_header_text);
					softassert.assertEquals(second_des.getText(), eaImageAccordionUtils.TEXT.second_image_des_text);
					System.out.println("Second Image Accordion Passed !!");
				}
			}

			// THIRD ACCORDION
			cursor.moveToElement(third_image).build().perform();
			Thread.sleep(2000);
			if (third_header.isDisplayed()) {
				if (!first_header.isDisplayed() && !second_header.isDisplayed() && !fourth_header.isDisplayed()
						&& !fifth_header.isDisplayed()) {
					softassert.assertEquals(third_header.getText(), eaImageAccordionUtils.TEXT.third_image_header_text);
					softassert.assertEquals(third_des.getText(), eaImageAccordionUtils.TEXT.third_image_des_text);
					System.out.println("Third Image Accordion Passed !!");
				}
			}

			// FOURTH ACCORDION
			cursor.moveToElement(fourth_image).build().perform();
			Thread.sleep(2000);
			if (fourth_header.isDisplayed()) {
				if (!second_header.isDisplayed() && !third_header.isDisplayed() && !first_header.isDisplayed()
						&& !fifth_header.isDisplayed()) {
					softassert.assertEquals(fourth_header.getText(),
							eaImageAccordionUtils.TEXT.fourth_image_header_text);
					softassert.assertEquals(fourth_des.getText(), eaImageAccordionUtils.TEXT.fourth_image_des_text);
					System.out.println("Fourth Image Accordion Passed !!");
				}
			}

			// FIFTH ACCORDION
			cursor.moveToElement(fifth_image).build().perform();
			Thread.sleep(2000);
			if (fifth_header.isDisplayed()) {
				if (!second_header.isDisplayed() && !third_header.isDisplayed() && !fourth_header.isDisplayed()
						&& !first_header.isDisplayed()) {
					softassert.assertEquals(fifth_header.getText(), eaImageAccordionUtils.TEXT.fifth_image_header_text);
					softassert.assertEquals(fifth_des.getText(), eaImageAccordionUtils.TEXT.fifth_image_des_text);
					System.out.println("Fifth Image Accordion Passed !!");
				}
			}
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
