package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaContentTickerUtils;

public class EaContentTicker {
	public static void eaContentTicker(WebDriver driver) {

		try {
//			assertEquals(driver.getTitle(), eaContentTickerUtils.TEXT.contentticker_page_title);
//			System.out.println("Page title passed !!");
//			
//			driver.findElement(By.xpath(eaContentTickerUtils.Locator.documentation_link_path)).click();
//			
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaContentTickerUtils.Locator.documentation_title_id)).getText(), eaContentTickerUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs2.get(0));
//			
//			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1043)", "");
			Actions mousehover = new Actions(driver);

			Thread.sleep(3000);

			assertEquals(driver.findElement(By.xpath(eaContentTickerUtils.Locator.trending_today_xpath)).getText(),
					eaContentTickerUtils.TEXT.trendin_today_text);
			WebElement element = driver.findElement(By.xpath(eaContentTickerUtils.Locator.template_text_xpath));
			mousehover.moveToElement(element).build().perform();
			Thread.sleep(1000);

			assertEquals(driver.findElement(By.xpath(eaContentTickerUtils.Locator.template_text_xpath)).getText(),
					eaContentTickerUtils.TEXT.template_text);
			System.out.println("Template text passed !!");
			driver.findElement(By.xpath(eaContentTickerUtils.Locator.navigation_button_xpath)).click();

			assertEquals(driver.findElement(By.xpath(eaContentTickerUtils.Locator.template_using_shortcode_text_xpath))
					.getText(), eaContentTickerUtils.TEXT.template_using_shortcode_text);
			System.out.println("Template using shortcut text passed !!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaContentTicker(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
			assertEquals(driver.getTitle(), eaContentTickerUtils.TEXT.contentticker_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaContentTickerUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaContentTickerUtils.Locator.documentation_title_id)).getText(),
					eaContentTickerUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));

			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1043)", "");
			Actions mousehover = new Actions(driver);

			Thread.sleep(3000);

			assertEquals(driver.findElement(By.xpath(eaContentTickerUtils.Locator.trending_today_xpath)).getText(),
					eaContentTickerUtils.TEXT.trendin_today_text);
			WebElement element = driver.findElement(By.xpath(eaContentTickerUtils.Locator.template_text_xpath));
			mousehover.moveToElement(element).build().perform();
			Thread.sleep(1000);

			assertEquals(driver.findElement(By.xpath(eaContentTickerUtils.Locator.template_text_xpath)).getText(),
					eaContentTickerUtils.TEXT.template_text);
			System.out.println("Template text passed !!");
			driver.findElement(By.xpath(eaContentTickerUtils.Locator.navigation_button_xpath)).click();
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaContentTickerUtils.Locator.template_using_shortcode_text_xpath))
					.getText(), eaContentTickerUtils.TEXT.template_using_shortcode_text);
			System.out.println("Template using shortcut text passed !!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
