package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaAdvancedDataTableUtils;

public class EaAdvancedDataTable {
	public static void eaAdvancedDataTable(WebDriver driver) {

		try {
			assertEquals(driver.getTitle(), eaAdvancedDataTableUtils.TEXT.advancedatatable_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaAdvancedDataTableUtils.Locator.documentation_title_id)).getText(),
					eaAdvancedDataTableUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));
//			
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1700)", "");

			// Data Table Style 01
			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_id_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_id_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_name_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_name_text);
			assertEquals(
					driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_address_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_address_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_city_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_city_text);
			assertEquals(
					driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_country_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_country_text);

			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_id_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_id_1_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_name_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_name_1_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_address_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_address_1_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_city_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_city_1_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_country_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_country_1_text);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaAdvancedDataTable(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);

		try {
			assertEquals(driver.getTitle(), eaAdvancedDataTableUtils.TEXT.advancedatatable_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaAdvancedDataTableUtils.Locator.documentation_title_id)).getText(),
					eaAdvancedDataTableUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));
//			
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1700)", "");

			// Data Table Style 01
			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_id_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_id_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_name_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_name_text);
			assertEquals(
					driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_address_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_address_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_city_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_city_text);
			assertEquals(
					driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_country_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_country_text);

			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_id_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_id_1_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_name_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_name_1_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_address_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_address_1_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_city_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_city_1_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_country_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_country_1_text);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
