package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaAdvancedAccordionUtils;

public class EaAdvancedAccordion {
	public static void eaAdvancedAccordion(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaAdvancedAccordionUtils.TEXT.advanceaccordion_page_title,
					eaAdvancedAccordionUtils.Locator.documentation_link_xpath,
					eaAdvancedAccordionUtils.TEXT.documentation_page);
			Thread.sleep(1000);

			Config.closeNotifications.betterdocs(driver);
			Config.closeNotifications.notificationBar(driver);
			Config.closeNotifications.floatNotification(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,972)", "");

			// FIRST ACCORDION
			WebElement first_icon = driver
					.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.first_accordion_icon_xpath));
			if (first_icon.isDisplayed()) {
				System.out.println("First icon display passed !!");
			} else {
				System.out.println("First icon display failed !!");
			}
			assertEquals(
					driver.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.first_accordion_text_xpath)).getText(),
					eaAdvancedAccordionUtils.TEXT.first_accordion_text);
			Thread.sleep(5000);
			driver.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.first_accordion_text_xpath)).click();
			driver.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.first_accordion_text_xpath)).click();
			Thread.sleep(1000);
			assertEquals(
					driver.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.first_accordion_des_xpath)).getText(),
					eaAdvancedAccordionUtils.TEXT.first_accordion_des);
			WebElement second_accordion_check = driver
					.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.second_accordion_des_xpath));
			WebElement third_accordion_check = driver
					.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.third_accordion_des_xpath));
			if (second_accordion_check.isDisplayed() || third_accordion_check.isDisplayed()) {
				System.out.println("Second or third did not closed !!");
			}

			// SECOND ACCORDION
			WebElement second_icon = driver
					.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.second_accordion_icon_xpath));
			if (second_icon.isDisplayed()) {
				System.out.println("Second icon display passed !!");
			} else {
				System.out.println("Second icon display failed !!");
			}
			assertEquals(driver.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.second_accordion_text_xpath))
					.getText(), eaAdvancedAccordionUtils.TEXT.second_accordion_text);
			driver.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.second_accordion_text_xpath)).click();
			Thread.sleep(1000);
			assertEquals(
					driver.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.second_accordion_des_xpath)).getText(),
					eaAdvancedAccordionUtils.TEXT.second_accordion_des);
			WebElement first_accordion_check = driver
					.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.first_accordion_des_xpath));
			WebElement third_accordion_check2 = driver
					.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.third_accordion_des_xpath));
			if (first_accordion_check.isDisplayed() || third_accordion_check2.isDisplayed()) {
				System.out.println("First or third did not closed !!");
			}

			// THIRD ACCORDION
			WebElement third_icon = driver
					.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.third_accordion_icon_xpath));
			if (third_icon.isDisplayed()) {
				System.out.println("Third icon display passed !!");
			} else {
				System.out.println("Third icon display failed !!");
			}
			assertEquals(
					driver.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.third_accordion_text_xpath)).getText(),
					eaAdvancedAccordionUtils.TEXT.third_accordion_text);
			driver.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.third_accordion_text_xpath)).click();
			Thread.sleep(1000);
			assertEquals(
					driver.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.third_accordion_des_xpath)).getText(),
					eaAdvancedAccordionUtils.TEXT.third_accordion_des);
			WebElement second_accordion_check2 = driver
					.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.second_accordion_des_xpath));
			WebElement first_accordion_check2 = driver
					.findElement(By.xpath(eaAdvancedAccordionUtils.Locator.first_accordion_des_xpath));
			if (second_accordion_check2.isDisplayed() && first_accordion_check2.isDisplayed()) {
				System.out.println("First or Second did not closed !!");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
