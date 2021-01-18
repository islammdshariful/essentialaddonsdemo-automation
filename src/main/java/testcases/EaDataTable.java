package testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import utils.eaDataTableUtils;

public class EaDataTable {
	public static void eaDataTable(WebDriver driver, String pageurl) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + pageurl);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaDataTableUtils.TEXT.datatable_page_title,
					eaDataTableUtils.Locator.documentation_link_path, eaDataTableUtils.TEXT.documentation_page);

			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1186)", "");

			// HEADER
			softassert.assertEquals(driver.findElement(By.xpath(eaDataTableUtils.Locator.day_header_text_xpath)).getText(),
					eaDataTableUtils.TEXT.day_header_text_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaDataTableUtils.Locator.time_header_text_xpath)).getText(),
					eaDataTableUtils.TEXT.time_header_text_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaDataTableUtils.Locator.class_header_text_xpath)).getText(),
					eaDataTableUtils.TEXT.class_header_text_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaDataTableUtils.Locator.instructor_header_text_xpath)).getText(),
					eaDataTableUtils.TEXT.instructor_header_text);
			System.out.println("Header passed !!");

			// DATA
			softassert.assertEquals(driver.findElement(By.xpath(eaDataTableUtils.Locator.day_data_text_xpath)).getText(),
					eaDataTableUtils.TEXT.day_data_text_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaDataTableUtils.Locator.time_data_text_xpath)).getText(),
					eaDataTableUtils.TEXT.time_data_text_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaDataTableUtils.Locator.class_data_text_xpath)).getText(),
					eaDataTableUtils.TEXT.class_data_text_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaDataTableUtils.Locator.instructor_data_xpath)).getText(),
					eaDataTableUtils.TEXT.instructor_data_text);
			System.out.println("Data passed !!");

			// IMAGE
			WebElement day_icon = driver.findElement(By.xpath(eaDataTableUtils.Locator.day_header_image_xpath));
			if (day_icon.isDisplayed()) {
				System.out.println("Day icon passed !!");
			}
			WebElement time_icon = driver.findElement(By.xpath(eaDataTableUtils.Locator.time_header_image_xpath));
			if (time_icon.isDisplayed()) {
				System.out.println("Time icon passed !!");
			}
			WebElement class_icon = driver.findElement(By.xpath(eaDataTableUtils.Locator.class_header_image_xpath));
			if (class_icon.isDisplayed()) {
				System.out.println("Class icon passed !!");
			}
			WebElement instructor_icon = driver
					.findElement(By.xpath(eaDataTableUtils.Locator.instructor_header_image_xpath));
			if (instructor_icon.isDisplayed()) {
				System.out.println("Instructor icon passed !!");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
