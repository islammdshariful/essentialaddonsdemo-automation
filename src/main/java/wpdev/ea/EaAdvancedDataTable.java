package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaAdvancedDataTableUtils;

public class EaAdvancedDataTable {
	public static void eaAdvancedDataTable(WebDriver driver, String pageurl) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + pageurl);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaAdvancedDataTableUtils.TEXT.advancedatatable_page_title,
					eaAdvancedDataTableUtils.Locator.documentation_link_path,
					eaAdvancedDataTableUtils.TEXT.documentation_page);
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1755)", "");

			// Data Table Style 01
			softassert.assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_id_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_id_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_name_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_name_text);
			softassert.assertEquals(
					driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_address_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_address_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_city_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_city_text);
			softassert.assertEquals(
					driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_th_country_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_th_country_text);

			softassert.assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_id_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_id_1_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_name_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_name_1_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_address_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_address_1_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_city_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_city_1_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaAdvancedDataTableUtils.Locator.table_country_1_xpath)).getText(),
					eaAdvancedDataTableUtils.TEXT.table_country_1_text);
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
