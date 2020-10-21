package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaStaticProductUtils;

public class EaStaticProduct {
	public static void eaStaticProduct(WebDriver driver) {

		try {
			// DOCUMENTAION PAGE
			assertEquals(driver.getTitle(), eaStaticProductUtils.TEXT.staticproduct_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaStaticProductUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaStaticProductUtils.Locator.documentation_title_id)).getText(),
					eaStaticProductUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));

			Thread.sleep(1000);

			// FIRST PRODUCT
			driver.findElement(By.xpath(eaStaticProductUtils.Locator.first_product_xpath)).click();
			assertEquals(driver.findElement(By.xpath(eaStaticProductUtils.Locator.first_product_description_xpath))
					.getText(), eaStaticProductUtils.TEXT.first_product_description_text);
			assertEquals(driver.findElement(By.xpath(eaStaticProductUtils.Locator.first_product_price_xpath)).getText(),
					eaStaticProductUtils.TEXT.first_product_price_text);
			assertEquals(
					driver.findElement(By.xpath(eaStaticProductUtils.Locator.first_product_review_xpath)).getText(),
					eaStaticProductUtils.TEXT.first_product_review_text);
			assertEquals(
					driver.findElement(By.xpath(eaStaticProductUtils.Locator.first_prodcut_button_xpath)).getText(),
					eaStaticProductUtils.TEXT.first_prodcut_button_text);
			System.out.println("First product passed !!");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaStaticProduct(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
			// DOCUMENTAION PAGE
			assertEquals(driver.getTitle(), eaStaticProductUtils.TEXT.staticproduct_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaStaticProductUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaStaticProductUtils.Locator.documentation_title_id)).getText(),
					eaStaticProductUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));

			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1165)", "");

			Thread.sleep(3000);

			// FIRST PRODUCT
//			driver.findElement(By.xpath(eaStaticProductUtils.Locator.first_product_xpath)).click();
			assertEquals(driver.findElement(By.xpath(eaStaticProductUtils.Locator.first_product_description_xpath))
					.getText(), eaStaticProductUtils.TEXT.first_product_description_text);
			assertEquals(driver.findElement(By.xpath(eaStaticProductUtils.Locator.first_product_price_xpath)).getText(),
					eaStaticProductUtils.TEXT.first_product_price_text);
			assertEquals(
					driver.findElement(By.xpath(eaStaticProductUtils.Locator.first_product_review_xpath)).getText(),
					eaStaticProductUtils.TEXT.first_product_review_text);
			assertEquals(
					driver.findElement(By.xpath(eaStaticProductUtils.Locator.first_prodcut_button_xpath)).getText(),
					eaStaticProductUtils.TEXT.first_prodcut_button_text);
			System.out.println("First product passed !!");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
