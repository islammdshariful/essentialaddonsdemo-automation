package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaImageAccordionUtils;

public class EaImageAccordion {
	public static void eaOnePageNavigation(WebDriver driver, String url) {
		driver.get(Config.url + url);

		try {
			if (Config.go_doc_page == 1) {
				assertEquals(driver.getTitle(), eaImageAccordionUtils.TEXT.imageaccordion_title);
				System.out.println("Page title passed !!");

				driver.findElement(By.xpath(eaImageAccordionUtils.Locator.documentation_link_path)).click();

				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(1));

				assertEquals(driver.findElement(By.id(eaImageAccordionUtils.Locator.documentation_title_id)).getText(),
						eaImageAccordionUtils.TEXT.documentation_page);
				System.out.println("Documentation link passed !!");
				driver.close();

				driver.switchTo().window(tabs2.get(0));

				Thread.sleep(1000);
			}

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1116)", "");

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
			cursor.moveToElement(first_image).build().perform();
			Thread.sleep(2000);
			if (first_header.isDisplayed()) {
				if (!second_header.isDisplayed() && !third_header.isDisplayed() && !fourth_header.isDisplayed()
						&& !fifth_header.isDisplayed()) {
					assertEquals(first_header.getText(), eaImageAccordionUtils.TEXT.first_image_header_text);
					assertEquals(first_des.getText(), eaImageAccordionUtils.TEXT.first_image_des_text);
					System.out.println("First Image Accordion Passed !!");
				}
			}

			// SECOND ACCORDION
			cursor.moveToElement(second_image).build().perform();
			Thread.sleep(2000);
			if (second_header.isDisplayed()) {
				if (!first_header.isDisplayed() && !third_header.isDisplayed() && !fourth_header.isDisplayed()
						&& !fifth_header.isDisplayed()) {
					assertEquals(second_header.getText(), eaImageAccordionUtils.TEXT.second_image_header_text);
					assertEquals(second_des.getText(), eaImageAccordionUtils.TEXT.second_image_des_text);
					System.out.println("Second Image Accordion Passed !!");
				}
			}

			// THIRD ACCORDION
			cursor.moveToElement(third_image).build().perform();
			Thread.sleep(2000);
			if (third_header.isDisplayed()) {
				if (!first_header.isDisplayed() && !second_header.isDisplayed() && !fourth_header.isDisplayed()
						&& !fifth_header.isDisplayed()) {
					assertEquals(third_header.getText(), eaImageAccordionUtils.TEXT.third_image_header_text);
					assertEquals(third_des.getText(), eaImageAccordionUtils.TEXT.third_image_des_text);
					System.out.println("Third Image Accordion Passed !!");
				}
			}

			// FOURTH ACCORDION
			cursor.moveToElement(fourth_image).build().perform();
			Thread.sleep(2000);
			if (fourth_header.isDisplayed()) {
				if (!second_header.isDisplayed() && !third_header.isDisplayed() && !first_header.isDisplayed()
						&& !fifth_header.isDisplayed()) {
					assertEquals(fourth_header.getText(), eaImageAccordionUtils.TEXT.fourth_image_header_text);
					assertEquals(fourth_des.getText(), eaImageAccordionUtils.TEXT.fourth_image_des_text);
					System.out.println("Fourth Image Accordion Passed !!");
				}
			}

			// FIFTH ACCORDION
			cursor.moveToElement(fifth_image).build().perform();
			Thread.sleep(2000);
			if (fifth_header.isDisplayed()) {
				if (!second_header.isDisplayed() && !third_header.isDisplayed() && !fourth_header.isDisplayed()
						&& !first_header.isDisplayed()) {
					assertEquals(fifth_header.getText(), eaImageAccordionUtils.TEXT.fifth_image_header_text);
					assertEquals(fifth_des.getText(), eaImageAccordionUtils.TEXT.fifth_image_des_text);
					System.out.println("Fifth Image Accordion Passed !!");
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
